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

package com.twolinessoftware;

import com.twolinessoftware.storage.DataStore;

/**
 *
 */
public class TestDataUtil {


    public static final String SERVER_SECRET = "3VwG2qX1ZvV43HA8SQvK";
    public static final String TEST_CLIENT_KEY = "dRZbYLVN=yjBW17V09Bf";


    public static String TEST_USER = "john@appreciado.net";
    public static String TEST_USER_PASSWORD = "12345678";
    public static int TEST_POINTS = 123;

    public static String CONFIRM_REPLY = "{\"ts\":1444834346679}";
    public static String APPROVAL_REPLY = "{\"ts\":1444834346679}";
    public static String POINTS_REPLY = "{\"ts\":1444834346679,\"pointsTotal\":133,\"pointsChange\":10}";
    public static String USER_REPLY = "{\"ts\":1444834346679,\"user\":{\"userId\":3,\"email\":\"sally@appreciado.net\",\"firstName\":\"Sally\",\"lastName\":\"Jones\",\"telephone\":\"+14035551212\",\"dateOfBirth\":\"1970/01/05\",\"secretKey\":\"V8DhW8WmI_OAfb65xSO2\",\"groupId\":3}}";
    public static String SEARCH_REPLY = "{\"ts\":1444831772994,\"totalResults\":4,\"clinics\":[{\"clinicId\":1,\"name\":\"Big Smiles Dental\",\"address\":{\"addressId\":1,\"address1\":\"1230 Crowchild Trail NW\",\"address2\":null,\"locality\":\"Calgary\",\"administrativeArea\":\"Alberta\",\"postalCode\":\"T1A1A1\",\"country\":\"Canada\"},\"telephone\":\"+15879984102\",\"email\":\"info@bigsmilesdental.ca\",\"website\":null,\"timeZone\":\"America/Edmonton\",\"latitude\":51.127236,\"longitude\":-114.197907,\"dentists\":[{\"practitionerId\":1,\"firstName\":\"Sarah\",\"lastName\":\"Lee\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":2,\"firstName\":\"Roger\",\"lastName\":\"Rabbit\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":3,\"firstName\":\"Linda\",\"lastName\":\"Smith\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":4,\"firstName\":\"Georgia\",\"lastName\":\"Watson\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1}]}]}";
    public static String DASHBOARD_REPLY = "{\"ts\":1444834406436,\"users\":[{\"userId\":3,\"email\":\"sally@appreciado.net\",\"firstName\":\"Sally\",\"lastName\":\"Jones\",\"telephone\":\"+14035551212\",\"dateOfBirth\":\"1970/01/05\",\"secretKey\":\"V8DhW8WmI_OAfb65xSO2\",\"groupId\":3},{\"userId\":4,\"email\":\"lincoln@appreciado.net\",\"firstName\":\"Lincoln\",\"lastName\":\"Jones\",\"telephone\":null,\"dateOfBirth\":\"2000/01/05\",\"secretKey\":\"eXMPi5li+gWy1!xjcPNA\",\"groupId\":3},{\"userId\":5,\"email\":\"rick@appreciado.net\",\"firstName\":\"Rick\",\"lastName\":\"Jones\",\"telephone\":\"+14035551212\",\"dateOfBirth\":\"1969/12/29\",\"secretKey\":\"vT9DuOgVjRAB2Ga2Mc=p\",\"groupId\":3},{\"userId\":6,\"email\":null,\"firstName\":\"Abby\",\"lastName\":\"Jones\",\"telephone\":null,\"dateOfBirth\":\"2007/07/15\",\"secretKey\":null,\"groupId\":3}],\"appointments\":[{\"appointmentId\":46,\"patientId\":3,\"clinicId\":1,\"practitionerId\":1,\"dateTime\":\"2015-10-14T08:17:24.000\",\"endDateTime\":\"2015-10-14T08:47:24.000\",\"confirmed\":false,\"dateConfirmed\":null,\"confirmedBy\":null,\"rescheduleRequested\":true,\"dateRescheduleRequested\":\"2015-10-14T14:06:25.000Z\",\"rescheduleRequestedBy\":3,\"checkedIn\":true,\"rated\":false,\"approved\":true},{\"appointmentId\":47,\"patientId\":3,\"clinicId\":1,\"practitionerId\":1,\"dateTime\":\"2015-10-14T06:30:24.000\",\"endDateTime\":\"2015-10-14T07:00:24.000\",\"confirmed\":false,\"dateConfirmed\":null,\"confirmedBy\":null,\"rescheduleRequested\":false,\"dateRescheduleRequested\":null,\"rescheduleRequestedBy\":null,\"checkedIn\":true,\"rated\":true,\"approved\":true},{\"appointmentId\":48,\"patientId\":3,\"clinicId\":1,\"practitionerId\":1,\"dateTime\":\"2015-10-16T08:05:24.000\",\"endDateTime\":\"2015-10-16T08:35:24.000\",\"confirmed\":true,\"dateConfirmed\":\"2015-10-14T14:05:59.000Z\",\"confirmedBy\":3,\"rescheduleRequested\":false,\"dateRescheduleRequested\":null,\"rescheduleRequestedBy\":null,\"checkedIn\":false,\"rated\":false,\"approved\":true},{\"appointmentId\":49,\"patientId\":3,\"clinicId\":1,\"practitionerId\":1,\"dateTime\":\"2020-09-30T16:15:00.000\",\"endDateTime\":\"2020-09-30T16:45:00.000\",\"confirmed\":false,\"dateConfirmed\":null,\"confirmedBy\":null,\"rescheduleRequested\":false,\"dateRescheduleRequested\":null,\"rescheduleRequestedBy\":null,\"checkedIn\":false,\"rated\":false,\"approved\":true},{\"appointmentId\":50,\"patientId\":3,\"clinicId\":1,\"practitionerId\":1,\"dateTime\":\"2020-10-03T12:00:00.000\",\"endDateTime\":\"2020-10-03T12:30:00.000\",\"confirmed\":false,\"dateConfirmed\":null,\"confirmedBy\":null,\"rescheduleRequested\":false,\"dateRescheduleRequested\":null,\"rescheduleRequestedBy\":null,\"checkedIn\":false,\"rated\":false,\"approved\":true}],\"dentists\":[{\"practitionerId\":1,\"firstName\":\"Sarah\",\"lastName\":\"Lee\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":2,\"firstName\":\"Roger\",\"lastName\":\"Rabbit\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":3,\"firstName\":\"Linda\",\"lastName\":\"Smith\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1}],\"clinics\":[{\"clinicId\":1,\"name\":\"Big Smiles Dental\",\"address\":{\"addressId\":1,\"address1\":\"1230 Crowchild Trail NW\",\"address2\":null,\"locality\":\"Calgary\",\"administrativeArea\":\"Alberta\",\"postalCode\":\"T1A1A1\",\"country\":\"Canada\"},\"telephone\":\"+15879984102\",\"email\":\"info@bigsmilesdental.ca\",\"website\":null,\"timeZone\":\"America/Edmonton\",\"latitude\":51.127236,\"longitude\":-114.197907}],\"userDentists\":[{\"userId\":3,\"dentistId\":1},{\"userId\":4,\"dentistId\":1},{\"userId\":5,\"dentistId\":2},{\"userId\":6,\"dentistId\":3}],\"points\":105}";
    public static String DASHBOARD_REPLY_NO_APPOINTMENTS = "{\"ts\":1444834406436,\"users\":[{\"userId\":3,\"email\":\"sally@appreciado.net\",\"firstName\":\"Sally\",\"lastName\":\"Jones\",\"telephone\":\"+14035551212\",\"dateOfBirth\":\"1970/01/05\",\"secretKey\":\"V8DhW8WmI_OAfb65xSO2\",\"groupId\":3},{\"userId\":4,\"email\":\"lincoln@appreciado.net\",\"firstName\":\"Lincoln\",\"lastName\":\"Jones\",\"telephone\":null,\"dateOfBirth\":\"2000/01/05\",\"secretKey\":\"eXMPi5li+gWy1!xjcPNA\",\"groupId\":3},{\"userId\":5,\"email\":\"rick@appreciado.net\",\"firstName\":\"Rick\",\"lastName\":\"Jones\",\"telephone\":\"+14035551212\",\"dateOfBirth\":\"1969/12/29\",\"secretKey\":\"vT9DuOgVjRAB2Ga2Mc=p\",\"groupId\":3},{\"userId\":6,\"email\":null,\"firstName\":\"Abby\",\"lastName\":\"Jones\",\"telephone\":null,\"dateOfBirth\":\"2007/07/15\",\"secretKey\":null,\"groupId\":3}],\"appointments\":[],\"dentists\":[{\"practitionerId\":1,\"firstName\":\"Sarah\",\"lastName\":\"Lee\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":2,\"firstName\":\"Roger\",\"lastName\":\"Rabbit\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1},{\"practitionerId\":3,\"firstName\":\"Linda\",\"lastName\":\"Smith\",\"practitionerType\":\"null\",\"telephone\":\"+15879984102\",\"email\":null,\"clinicId\":1}],\"clinics\":[{\"clinicId\":1,\"name\":\"Big Smiles Dental\",\"address\":{\"addressId\":1,\"address1\":\"1230 Crowchild Trail NW\",\"address2\":null,\"locality\":\"Calgary\",\"administrativeArea\":\"Alberta\",\"postalCode\":\"T1A1A1\",\"country\":\"Canada\"},\"telephone\":\"+15879984102\",\"email\":\"info@bigsmilesdental.ca\",\"website\":null,\"timeZone\":\"America/Edmonton\",\"latitude\":51.127236,\"longitude\":-114.197907}],\"userDentists\":[{\"userId\":3,\"dentistId\":1},{\"userId\":4,\"dentistId\":1},{\"userId\":5,\"dentistId\":2},{\"userId\":6,\"dentistId\":3}],\"points\":105}";
    public static String REFERRAL_REPLY = "{\"ts\":1444834346679,\"referralId\":111}";
    public static String RATING_REPLY = "{\"ts\":1444834346679,\"ratingId\":123}";


    public static void loginDemoUser() {
        DataStore ds = DataStore.getInstance();
        ds.setEmailPass(TEST_USER, TEST_USER_PASSWORD);
        ds.setSignedin(true);
        ds.setFirstLastName("first", "last");
        ds.setPoints(TEST_POINTS);


    }


}
