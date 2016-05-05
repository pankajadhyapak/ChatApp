package com.example.pankaj.chatapp.Helpers;

/**
 * Created by pankaj on 19/01/16.
 */
public class Constants {

    public static final String BASE_URL = "http://192.168.2.4:8000/";

    public static final String API_BASE_URL = BASE_URL+"api/";


    public static final String FRAGMENT_ALL_DOCTORS = "FRAGMENT_ALL_DOCTORS";
    public static final String FRAGMENT_HOME= "FRAGMENT_HOME";
    public static final String FRAGMENT_IN_NETWORK= "FRAGMENT_IN_NETWORK";
    public static final String FRAGMENT_MY_CASES= "FRAGMENT_MY_CASES";
    public static final String FRAGMENT_SHARED_CASES= "FRAGMENT_SHARED_CASES";
    public static final String FRAGMENT_REQUESTS= "FRAGMENT_REQUESTS";
    public static final String PRESENT_FRAGMENT = "PRESENT_FRAGMENT";


    public static final String REGISTRATION_ID_SET = "TOKEN_SET";
    public static final String REGISTRATION_ID = "REGISTRATION_ID";
    public static final String REGISTRATION_COMPLETE = "REGISTRATION_COMPLETE";




    public static final String LOGGED_IN = "LOGGED_IN";
    public static final String LOGGED_IN_NAME = "LOGGED_IN_NAME";
    public static final String LOGGED_IN_EMAIL = "LOGGED_IN_EMAIL";
    public static final String LOGGED_IN_PHONE = "LOGGED_IN_PHONE";
    public static final String LOGGED_IN_TOKEN = "LOGGED_IN_TOKEN";
    public static final String LOGGED_IN_ID = "LOGGED_IN_ID";



    /**
     * Routes Path for API
     */
    public static final String REGISTRATION_PATH = "register";
    public static final String LOGIN_PATH = "login";
    public static final String GCM_REGISTER_PATH = "user/registerDeviceId";
    public static final String ALL_DOCTORS_PATH = "users";
    public static final String DOCTOR_REQUEST_PATH = "user/addFriend";
    public static final String DOCTOR_PENDING_REQUESTING = "user/getFriendRequest";
    public static final String DOCTOR_FRIENDS = "user/myfriends";
    public static final String DOCTOR_REQUEST_ACCEPT_PATH = "user/acceptFriend";


    /**
     * New Case Keys
     */


    public static final String CASE_IDENTIFIER = "CASE_IDENTIFIER";
    public static final String CASE_GENERAL_DETAILS_COMPLETE = "CASE_GENERAL_DETAILS_COMPLETE";
    public static final String CASE_MEDIA_DETAILS_COMPLETE = "CASE_MEDIA_DETAILS_COMPLETE";
    public static final String CASE_MEDICATION_DETAILS_COMPLETE = "CASE_MEDICATION_DETAILS_COMPLETE";


    public static final String CASE_GENERAL_DETAILS_NAME = "CASE_GENERAL_DETAILS_NAME";
    public static final String CASE_GENERAL_DETAILS_AGE = "CASE_GENERAL_DETAILS_AGE";
    public static final String CASE_GENERAL_DETAILS_OCCUPATION = "CASE_GENERAL_DETAILS_OCCUPATION";
    public static final String CASE_GENERAL_DETAILS_PRESENTING_COMPLAINT = "CASE_GENERAL_DETAILS_PRESENTING_COMPLAINT";
    public static final String CASE_GENERAL_DETAILS_SYMPTOMS = "CASE_GENERAL_DETAILS_SYMPTOMS";
    public static final String CASE_GENERAL_DETAILS_HEAD_TO_TOE_EXAMINATION = "CASE_GENERAL_DETAILS_HEAD_TO_TOE_EXAMINATION";
    public static final String CASE_GENERAL_DETAILS_BUILD = "CASE_GENERAL_DETAILS_BUILD";
    public static final String CASE_GENERAL_DETAILS_NOURISHMENT = "CASE_GENERAL_DETAILS_NOURISHMENT";
    public static final String CASE_GENERAL_DETAILS_EYES = "CASE_GENERAL_DETAILS_EYES";
    public static final String CASE_GENERAL_DETAILS_SEX = "CASE_GENERAL_DETAILS_SEX";
    public static final String CASE_GENERAL_DETAILS_MARITAL_STATUS = "CASE_GENERAL_DETAILS_MARITAL_STATUS";


    public static final String CASE_INVESTIGATION_DETAILS_PULSE_RATE = "CASE_INVESTIGATION_DETAILS_PULSE_RATE";
    public static final String CASE_INVESTIGATION_DETAILS_TEMPERATURE_RATE = "CASE_INVESTIGATION_DETAILS_TEMPERATURE_RATE";
    public static final String CASE_INVESTIGATION_DETAILS_BLOOD_PRESSURE = "CASE_INVESTIGATION_DETAILS_BLOOD_PRESSURE";
    public static final String CASE_INVESTIGATION_DETAILS_RESPIRATORY_RATE = "CASE_INVESTIGATION_DETAILS_RESPIRATORY_RATE";
    public static final String CASE_INVESTIGATION_DETAILS_COMPLETE = "CASE_INVESTIGATION_DETAILS_COMPLETE";
    public static final String CASE_INVESTIGATION_DETAILS_DIAGNOSIS = "CASE_INVESTIGATION_DETAILS_DIAGNOSIS";


    public static final String CASE_MEDICATION_DETAILS_TREATMENT_UNDER_PROCESS = "CASE_MEDICATION_DETAILS_TREATMENT_UNDER_PROCESS";
    public static final String CASE_MEDICATION_DETAILS_SURGERY = "CASE_MEDICATION_DETAILS_SURGERY";
    public static final String CASE_MEDICATION_DETAILS_PRESCRIPTION = "CASE_MEDICATION_DETAILS_PRESCRIPTION";


    public static final String CASE_SYSTEMIC_DETAILS_COMPLETE = "CASE_SYSTEMIC_DETAILS_COMPLETE";
    public static final String CASE_SYSTEMIC_DETAILS_CARIO_VASCULAR = "CASE_SYSTEMIC_DETAILS_CARIO_VASCULAR";
    public static final String CASE_SYSTEMIC_DETAILS_RESPIRATORY = "CASE_SYSTEMIC_DETAILS_RESPIRATORY";
    public static final String CASE_SYSTEMIC_DETAILS_PER_CENTRAL_NERVOUS = "CASE_SYSTEMIC_DETAILS_PER_CENTRAL_NERVOUS";
    public static final String CASE_SYSTEMIC_DETAILS_ABDOMEN = "CASE_SYSTEMIC_DETAILS_ABDOMEN";


    public static final String CASE_HISTORY_DETAILS_COMPLETE = "CASE_HISTORY_DETAILS_COMPLETE";
    public static final String CASE_HISTORY_DETAILS_ANY_SURGERIES = "CASE_HISTORY_DETAILS_ANY_SURGERIES";
    public static final String CASE_HISTORY_DETAILS_DURG = "CASE_HISTORY_DETAILS_DURG";
    public static final String CASE_HISTORY_DETAILS_SLEEP = "CASE_HISTORY_DETAILS_SLEEP";
    public static final String CASE_HISTORY_DETAILS_APPETITE = "CASE_HISTORY_DETAILS_APPETITE";
    public static final String CASE_HISTORY_DETAILS_BOWEL_BEHAVIOUR = "CASE_HISTORY_DETAILS_BOWEL_BEHAVIOUR";
    public static final String CASE_HISTORY_DETAILS_FAMILY_HISTORY = "CASE_HISTORY_DETAILS_FAMILY_HISTORY";
    public static final String CASE_HISTORY_DETAILS_SIMILAR_COMPLAINTS = "CASE_HISTORY_DETAILS_SIMILAR_COMPLAINTS";
    public static final String CASE_HISTORY_DETAILS_HYPERTENSION = "CASE_HISTORY_DETAILS_HYPERTENSION";
    public static final String CASE_HISTORY_DETAILS_DIABETES = "CASE_HISTORY_DETAILS_DIABETES";
    public static final String CASE_HISTORY_DETAILS_ANY_SURGERIES_RADIO = "CASE_HISTORY_DETAILS_ANY_SURGERIES_RADIO";
    public static final String CASE_HISTORY_DETAILS_SMOKING = "CASE_HISTORY_DETAILS_SMOKING";
    public static final String CASE_HISTORY_DETAILS_DRINKING = "CASE_HISTORY_DETAILS_DRINKING";
    public static final String CASE_HISTORY_DETAILS_CHEWING_TABACCO = "CASE_HISTORY_DETAILS_CHEWING_TABACCO";
    public static final String CASE_HISTORY_DETAILS_SLEEPING_PILLS = "CASE_HISTORY_DETAILS_SLEEPING_PILLS";

    public static final String CASE_STORE_PATH = "case";
    public static final String CASE_GET_ALL_PATH = "case/all";
    public static final String CASE_GET_SHARED_PATH = "case/sharedByCases";
    public static final String CASE_SHARE_PATH = "case/shareCase";
    public static final String ALL_CHATS_PATH = "case/{id}/chathistory";
    public static final String ALL_MESSAGES_PATH = "chatMsgs";
    public static final String SEND_MESSAGE_PATH = "chatMsgs";
    public static final String ALL_USERS_PATH = "users";

    public static final String CURRENT_CHATTING_ID = "CurrentChattingId";

    public static final String SEND_IMAGE_PATH = "chatMsgs/image";
}
