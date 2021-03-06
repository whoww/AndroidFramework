/*
 * Copyright 2016 2LinesSoftware Inc
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.twolinessoftware.authentication;

import android.accounts.AccountManager;
import android.content.Context;

import com.firebase.client.Firebase;
import com.twolinessoftware.Config;
import com.twolinessoftware.PreferencesHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class AuthenticationModule {

    private final Context mContext;

    public AuthenticationModule(Context context) {
        mContext = context;
    }

    @Provides
    AccountManager provideAccountManager() {
        return (AccountManager) mContext.getSystemService(Context.ACCOUNT_SERVICE);
    }

    @Provides
    @Singleton
    UserManager provideUserManager(Firebase firebase, PreferencesHelper preferencesHelper) {
        return new FirebaseUserManager(firebase, preferencesHelper);
    }

    @Provides
    Firebase provideFirebase() {
        return new Firebase(Config.FIREBASE_URL);
    }


}
