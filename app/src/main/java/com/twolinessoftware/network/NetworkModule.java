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

package com.twolinessoftware.network;

import android.content.Context;

import com.twolinessoftware.Config;

import dagger.Module;
import dagger.Provides;
import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 *
 */
@Module
public class NetworkModule {

    private final Context mContext;

    public NetworkModule(Context context) {
        mContext = context;
    }

    /**
     * API Services are defined here
     *
     * @return
     */
    @Provides
    BaseApiService provideBaseApiService() {
        return new BaseRetrofitHelper().newBaseApiService(Config.URL_ENDPOINT);
    }

    @Provides
    Scheduler provideSubscribeScheduler() {
        return Schedulers.io();
    }

}
