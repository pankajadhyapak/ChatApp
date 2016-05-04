package com.example.pankaj.chatapp.Models.Case;

import com.example.pankaj.chatapp.Models.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by pankaj on 18/04/16.
 */
public class AllDetails implements Serializable {


        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        @SerializedName("case_investigation_details_respiratory_rate")
        @Expose
        private String caseInvestigationDetailsRespiratoryRate;
        @SerializedName("case_history_details_hypertension")
        @Expose
        private String caseHistoryDetailsHypertension;
        @SerializedName("case_history_details_smoking")
        @Expose
        private String caseHistoryDetailsSmoking;
        @SerializedName("case_medication_details_complete")
        @Expose
        private String caseMedicationDetailsComplete;
        @SerializedName("case_systemic_details_abdomen")
        @Expose
        private String caseSystemicDetailsAbdomen;
        @SerializedName("case_medication_details_prescription")
        @Expose
        private String caseMedicationDetailsPrescription;
        @SerializedName("case_general_details_nourishment")
        @Expose
        private String caseGeneralDetailsNourishment;
        @SerializedName("case_investigation_details_diagnosis")
        @Expose
        private String caseInvestigationDetailsDiagnosis;
        @SerializedName("case_history_details_similar_complaints_checked_id")
        @Expose
        private String caseHistoryDetailsSimilarComplaintsCheckedId;
        @SerializedName("case_systemic_details_per_central_nervous")
        @Expose
        private String caseSystemicDetailsPerCentralNervous;
        @SerializedName("case_history_details_any_surgeries")
        @Expose
        private String caseHistoryDetailsAnySurgeries;
        @SerializedName("case_general_details_complete")
        @Expose
        private String caseGeneralDetailsComplete;
        @SerializedName("case_general_details_marital_status_checked_id")
        @Expose
        private String caseGeneralDetailsMaritalStatusCheckedId;
        @SerializedName("case_systemic_details_complete")
        @Expose
        private String caseSystemicDetailsComplete;
        @SerializedName("case_medication_details_surgery")
        @Expose
        private String caseMedicationDetailsSurgery;
        @SerializedName("case_general_details_head_to_toe_examination")
        @Expose
        private String caseGeneralDetailsHeadToToeExamination;
        @SerializedName("case_general_details_sex_checked_id")
        @Expose
        private String caseGeneralDetailsSexCheckedId;
        @SerializedName("case_general_details_sex")
        @Expose
        private String caseGeneralDetailsSex;
        @SerializedName("case_general_details_build")
        @Expose
        private String caseGeneralDetailsBuild;
        @SerializedName("case_general_details_marital_status")
        @Expose
        private String caseGeneralDetailsMaritalStatus;
        @SerializedName("case_history_details_sleep")
        @Expose
        private String caseHistoryDetailsSleep;
        @SerializedName("case_history_details_family_history")
        @Expose
        private String caseHistoryDetailsFamilyHistory;
        @SerializedName("case_general_details_eyes")
        @Expose
        private String caseGeneralDetailsEyes;
        @SerializedName("case_investigation_details_complete")
        @Expose
        private String caseInvestigationDetailsComplete;
        @SerializedName("case_history_details_durg")
        @Expose
        private String caseHistoryDetailsDurg;
        @SerializedName("case_history_details_hypertension_checked_id")
        @Expose
        private String caseHistoryDetailsHypertensionCheckedId;
        @SerializedName("case_history_details_diabetes")
        @Expose
        private String caseHistoryDetailsDiabetes;
        @SerializedName("case_identifier")
        @Expose
        private String caseIdentifier;
        @SerializedName("case_investigation_details_blood_pressure")
        @Expose
        private String caseInvestigationDetailsBloodPressure;
        @SerializedName("case_media_details_complete")
        @Expose
        private String caseMediaDetailsComplete;
        @SerializedName("case_history_details_complete")
        @Expose
        private String caseHistoryDetailsComplete;
        @SerializedName("case_general_details_presenting_complaint")
        @Expose
        private String caseGeneralDetailsPresentingComplaint;
        @SerializedName("case_general_details_age")
        @Expose
        private String caseGeneralDetailsAge;
        @SerializedName("case_investigation_details_temperature_rate")
        @Expose
        private String caseInvestigationDetailsTemperatureRate;
        @SerializedName("case_general_details_symptoms")
        @Expose
        private String caseGeneralDetailsSymptoms;
        @SerializedName("case_history_details_diabetes_checked_id")
        @Expose
        private String caseHistoryDetailsDiabetesCheckedId;
        @SerializedName("case_history_details_any_surgeries_radio")
        @Expose
        private String caseHistoryDetailsAnySurgeriesRadio;
        @SerializedName("case_investigation_details_pulse_rate")
        @Expose
        private String caseInvestigationDetailsPulseRate;
        @SerializedName("case_history_details_sleeping_pills")
        @Expose
        private String caseHistoryDetailsSleepingPills;
        @SerializedName("case_history_details_appetite")
        @Expose
        private String caseHistoryDetailsAppetite;
        @SerializedName("case_history_details_drinking")
        @Expose
        private String caseHistoryDetailsDrinking;
        @SerializedName("case_history_details_similar_complaints")
        @Expose
        private String caseHistoryDetailsSimilarComplaints;
        @SerializedName("case_history_details_chewing_tabacco")
        @Expose
        private String caseHistoryDetailsChewingTabacco;
        @SerializedName("case_general_details_occupation")
        @Expose
        private String caseGeneralDetailsOccupation;
        @SerializedName("case_general_details_name")
        @Expose
        private String caseGeneralDetailsName;
        @SerializedName("case_history_details_bowel_behaviour")
        @Expose
        private String caseHistoryDetailsBowelBehaviour;
        @SerializedName("case_history_details_any_surgeries_radio_checked_id")
        @Expose
        private String caseHistoryDetailsAnySurgeriesRadioCheckedId;
        @SerializedName("case_medication_details_treatment_under_process")
        @Expose
        private String caseMedicationDetailsTreatmentUnderProcess;
        @SerializedName("case_systemic_details_respiratory")
        @Expose
        private String caseSystemicDetailsRespiratory;
        @SerializedName("case_systemic_details_cario_vascular")
        @Expose
        private String caseSystemicDetailsCarioVascular;


        @SerializedName("created_at")
        @Expose
        private String createdAt;

        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public User getOwner() {
                return owner;
        }

        public void setOwner(User owner) {
                this.owner = owner;
        }

        @SerializedName("user")
        @Expose
        private User owner;

        public String getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
                return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
        }

        /**
         *
         * @return
         * The caseInvestigationDetailsRespiratoryRate
         */
        public String getCaseInvestigationDetailsRespiratoryRate() {
            return caseInvestigationDetailsRespiratoryRate;
        }

        /**
         *
         * @param caseInvestigationDetailsRespiratoryRate
         * The case_investigation_details_respiratory_rate
         */
        public void setCaseInvestigationDetailsRespiratoryRate(String caseInvestigationDetailsRespiratoryRate) {
            this.caseInvestigationDetailsRespiratoryRate = caseInvestigationDetailsRespiratoryRate;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsHypertension
         */
        public String getCaseHistoryDetailsHypertension() {
            return caseHistoryDetailsHypertension;
        }

        /**
         *
         * @param caseHistoryDetailsHypertension
         * The case_history_details_hypertension
         */
        public void setCaseHistoryDetailsHypertension(String caseHistoryDetailsHypertension) {
            this.caseHistoryDetailsHypertension = caseHistoryDetailsHypertension;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsSmoking
         */
        public String getCaseHistoryDetailsSmoking() {
            return caseHistoryDetailsSmoking;
        }

        /**
         *
         * @param caseHistoryDetailsSmoking
         * The case_history_details_smoking
         */
        public void setCaseHistoryDetailsSmoking(String caseHistoryDetailsSmoking) {
            this.caseHistoryDetailsSmoking = caseHistoryDetailsSmoking;
        }

        /**
         *
         * @return
         * The caseMedicationDetailsComplete
         */
        public String getCaseMedicationDetailsComplete() {
            return caseMedicationDetailsComplete;
        }

        /**
         *
         * @param caseMedicationDetailsComplete
         * The case_medication_details_complete
         */
        public void setCaseMedicationDetailsComplete(String caseMedicationDetailsComplete) {
            this.caseMedicationDetailsComplete = caseMedicationDetailsComplete;
        }

        /**
         *
         * @return
         * The caseSystemicDetailsAbdomen
         */
        public String getCaseSystemicDetailsAbdomen() {
            return caseSystemicDetailsAbdomen;
        }

        /**
         *
         * @param caseSystemicDetailsAbdomen
         * The case_systemic_details_abdomen
         */
        public void setCaseSystemicDetailsAbdomen(String caseSystemicDetailsAbdomen) {
            this.caseSystemicDetailsAbdomen = caseSystemicDetailsAbdomen;
        }

        /**
         *
         * @return
         * The caseMedicationDetailsPrescription
         */
        public String getCaseMedicationDetailsPrescription() {
            return caseMedicationDetailsPrescription;
        }

        /**
         *
         * @param caseMedicationDetailsPrescription
         * The case_medication_details_prescription
         */
        public void setCaseMedicationDetailsPrescription(String caseMedicationDetailsPrescription) {
            this.caseMedicationDetailsPrescription = caseMedicationDetailsPrescription;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsNourishment
         */
        public String getCaseGeneralDetailsNourishment() {
            return caseGeneralDetailsNourishment;
        }

        /**
         *
         * @param caseGeneralDetailsNourishment
         * The case_general_details_nourishment
         */
        public void setCaseGeneralDetailsNourishment(String caseGeneralDetailsNourishment) {
            this.caseGeneralDetailsNourishment = caseGeneralDetailsNourishment;
        }

        /**
         *
         * @return
         * The caseInvestigationDetailsDiagnosis
         */
        public String getCaseInvestigationDetailsDiagnosis() {
            return caseInvestigationDetailsDiagnosis;
        }

        /**
         *
         * @param caseInvestigationDetailsDiagnosis
         * The case_investigation_details_diagnosis
         */
        public void setCaseInvestigationDetailsDiagnosis(String caseInvestigationDetailsDiagnosis) {
            this.caseInvestigationDetailsDiagnosis = caseInvestigationDetailsDiagnosis;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsSimilarComplaintsCheckedId
         */
        public String getCaseHistoryDetailsSimilarComplaintsCheckedId() {
            return caseHistoryDetailsSimilarComplaintsCheckedId;
        }

        /**
         *
         * @param caseHistoryDetailsSimilarComplaintsCheckedId
         * The case_history_details_similar_complaints_checked_id
         */
        public void setCaseHistoryDetailsSimilarComplaintsCheckedId(String caseHistoryDetailsSimilarComplaintsCheckedId) {
            this.caseHistoryDetailsSimilarComplaintsCheckedId = caseHistoryDetailsSimilarComplaintsCheckedId;
        }

        /**
         *
         * @return
         * The caseSystemicDetailsPerCentralNervous
         */
        public String getCaseSystemicDetailsPerCentralNervous() {
            return caseSystemicDetailsPerCentralNervous;
        }

        /**
         *
         * @param caseSystemicDetailsPerCentralNervous
         * The case_systemic_details_per_central_nervous
         */
        public void setCaseSystemicDetailsPerCentralNervous(String caseSystemicDetailsPerCentralNervous) {
            this.caseSystemicDetailsPerCentralNervous = caseSystemicDetailsPerCentralNervous;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsAnySurgeries
         */
        public String getCaseHistoryDetailsAnySurgeries() {
            return caseHistoryDetailsAnySurgeries;
        }

        /**
         *
         * @param caseHistoryDetailsAnySurgeries
         * The case_history_details_any_surgeries
         */
        public void setCaseHistoryDetailsAnySurgeries(String caseHistoryDetailsAnySurgeries) {
            this.caseHistoryDetailsAnySurgeries = caseHistoryDetailsAnySurgeries;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsComplete
         */
        public String getCaseGeneralDetailsComplete() {
            return caseGeneralDetailsComplete;
        }

        /**
         *
         * @param caseGeneralDetailsComplete
         * The case_general_details_complete
         */
        public void setCaseGeneralDetailsComplete(String caseGeneralDetailsComplete) {
            this.caseGeneralDetailsComplete = caseGeneralDetailsComplete;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsMaritalStatusCheckedId
         */
        public String getCaseGeneralDetailsMaritalStatusCheckedId() {
            return caseGeneralDetailsMaritalStatusCheckedId;
        }

        /**
         *
         * @param caseGeneralDetailsMaritalStatusCheckedId
         * The case_general_details_marital_status_checked_id
         */
        public void setCaseGeneralDetailsMaritalStatusCheckedId(String caseGeneralDetailsMaritalStatusCheckedId) {
            this.caseGeneralDetailsMaritalStatusCheckedId = caseGeneralDetailsMaritalStatusCheckedId;
        }

        /**
         *
         * @return
         * The caseSystemicDetailsComplete
         */
        public String getCaseSystemicDetailsComplete() {
            return caseSystemicDetailsComplete;
        }

        /**
         *
         * @param caseSystemicDetailsComplete
         * The case_systemic_details_complete
         */
        public void setCaseSystemicDetailsComplete(String caseSystemicDetailsComplete) {
            this.caseSystemicDetailsComplete = caseSystemicDetailsComplete;
        }

        /**
         *
         * @return
         * The caseMedicationDetailsSurgery
         */
        public String getCaseMedicationDetailsSurgery() {
            return caseMedicationDetailsSurgery;
        }

        /**
         *
         * @param caseMedicationDetailsSurgery
         * The case_medication_details_surgery
         */
        public void setCaseMedicationDetailsSurgery(String caseMedicationDetailsSurgery) {
            this.caseMedicationDetailsSurgery = caseMedicationDetailsSurgery;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsHeadToToeExamination
         */
        public String getCaseGeneralDetailsHeadToToeExamination() {
            return caseGeneralDetailsHeadToToeExamination;
        }

        /**
         *
         * @param caseGeneralDetailsHeadToToeExamination
         * The case_general_details_head_to_toe_examination
         */
        public void setCaseGeneralDetailsHeadToToeExamination(String caseGeneralDetailsHeadToToeExamination) {
            this.caseGeneralDetailsHeadToToeExamination = caseGeneralDetailsHeadToToeExamination;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsSexCheckedId
         */
        public String getCaseGeneralDetailsSexCheckedId() {
            return caseGeneralDetailsSexCheckedId;
        }

        /**
         *
         * @param caseGeneralDetailsSexCheckedId
         * The case_general_details_sex_checked_id
         */
        public void setCaseGeneralDetailsSexCheckedId(String caseGeneralDetailsSexCheckedId) {
            this.caseGeneralDetailsSexCheckedId = caseGeneralDetailsSexCheckedId;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsSex
         */
        public String getCaseGeneralDetailsSex() {
            return caseGeneralDetailsSex;
        }

        /**
         *
         * @param caseGeneralDetailsSex
         * The case_general_details_sex
         */
        public void setCaseGeneralDetailsSex(String caseGeneralDetailsSex) {
            this.caseGeneralDetailsSex = caseGeneralDetailsSex;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsBuild
         */
        public String getCaseGeneralDetailsBuild() {
            return caseGeneralDetailsBuild;
        }

        /**
         *
         * @param caseGeneralDetailsBuild
         * The case_general_details_build
         */
        public void setCaseGeneralDetailsBuild(String caseGeneralDetailsBuild) {
            this.caseGeneralDetailsBuild = caseGeneralDetailsBuild;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsMaritalStatus
         */
        public String getCaseGeneralDetailsMaritalStatus() {
            return caseGeneralDetailsMaritalStatus;
        }

        /**
         *
         * @param caseGeneralDetailsMaritalStatus
         * The case_general_details_marital_status
         */
        public void setCaseGeneralDetailsMaritalStatus(String caseGeneralDetailsMaritalStatus) {
            this.caseGeneralDetailsMaritalStatus = caseGeneralDetailsMaritalStatus;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsSleep
         */
        public String getCaseHistoryDetailsSleep() {
            return caseHistoryDetailsSleep;
        }

        /**
         *
         * @param caseHistoryDetailsSleep
         * The case_history_details_sleep
         */
        public void setCaseHistoryDetailsSleep(String caseHistoryDetailsSleep) {
            this.caseHistoryDetailsSleep = caseHistoryDetailsSleep;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsFamilyHistory
         */
        public String getCaseHistoryDetailsFamilyHistory() {
            return caseHistoryDetailsFamilyHistory;
        }

        /**
         *
         * @param caseHistoryDetailsFamilyHistory
         * The case_history_details_family_history
         */
        public void setCaseHistoryDetailsFamilyHistory(String caseHistoryDetailsFamilyHistory) {
            this.caseHistoryDetailsFamilyHistory = caseHistoryDetailsFamilyHistory;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsEyes
         */
        public String getCaseGeneralDetailsEyes() {
            return caseGeneralDetailsEyes;
        }

        /**
         *
         * @param caseGeneralDetailsEyes
         * The case_general_details_eyes
         */
        public void setCaseGeneralDetailsEyes(String caseGeneralDetailsEyes) {
            this.caseGeneralDetailsEyes = caseGeneralDetailsEyes;
        }

        /**
         *
         * @return
         * The caseInvestigationDetailsComplete
         */
        public String getCaseInvestigationDetailsComplete() {
            return caseInvestigationDetailsComplete;
        }

        /**
         *
         * @param caseInvestigationDetailsComplete
         * The case_investigation_details_complete
         */
        public void setCaseInvestigationDetailsComplete(String caseInvestigationDetailsComplete) {
            this.caseInvestigationDetailsComplete = caseInvestigationDetailsComplete;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsDurg
         */
        public String getCaseHistoryDetailsDurg() {
            return caseHistoryDetailsDurg;
        }

        /**
         *
         * @param caseHistoryDetailsDurg
         * The case_history_details_durg
         */
        public void setCaseHistoryDetailsDurg(String caseHistoryDetailsDurg) {
            this.caseHistoryDetailsDurg = caseHistoryDetailsDurg;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsHypertensionCheckedId
         */
        public String getCaseHistoryDetailsHypertensionCheckedId() {
            return caseHistoryDetailsHypertensionCheckedId;
        }

        /**
         *
         * @param caseHistoryDetailsHypertensionCheckedId
         * The case_history_details_hypertension_checked_id
         */
        public void setCaseHistoryDetailsHypertensionCheckedId(String caseHistoryDetailsHypertensionCheckedId) {
            this.caseHistoryDetailsHypertensionCheckedId = caseHistoryDetailsHypertensionCheckedId;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsDiabetes
         */
        public String getCaseHistoryDetailsDiabetes() {
            return caseHistoryDetailsDiabetes;
        }

        /**
         *
         * @param caseHistoryDetailsDiabetes
         * The case_history_details_diabetes
         */
        public void setCaseHistoryDetailsDiabetes(String caseHistoryDetailsDiabetes) {
            this.caseHistoryDetailsDiabetes = caseHistoryDetailsDiabetes;
        }

        /**
         *
         * @return
         * The caseCaseIdentifier
         */
        public String getCaseIdentifier() {
            return caseIdentifier;
        }

        /**
         *
         * @param caseCaseIdentifier
         * The case_case_identifier
         */
        public void setCaseIdentifier(String caseCaseIdentifier) {
            this.caseIdentifier = caseCaseIdentifier;
        }

        /**
         *
         * @return
         * The caseInvestigationDetailsBloodPressure
         */
        public String getCaseInvestigationDetailsBloodPressure() {
            return caseInvestigationDetailsBloodPressure;
        }

        /**
         *
         * @param caseInvestigationDetailsBloodPressure
         * The case_investigation_details_blood_pressure
         */
        public void setCaseInvestigationDetailsBloodPressure(String caseInvestigationDetailsBloodPressure) {
            this.caseInvestigationDetailsBloodPressure = caseInvestigationDetailsBloodPressure;
        }

        /**
         *
         * @return
         * The caseMediaDetailsComplete
         */
        public String getCaseMediaDetailsComplete() {
            return caseMediaDetailsComplete;
        }

        /**
         *
         * @param caseMediaDetailsComplete
         * The case_media_details_complete
         */
        public void setCaseMediaDetailsComplete(String caseMediaDetailsComplete) {
            this.caseMediaDetailsComplete = caseMediaDetailsComplete;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsComplete
         */
        public String getCaseHistoryDetailsComplete() {
            return caseHistoryDetailsComplete;
        }

        /**
         *
         * @param caseHistoryDetailsComplete
         * The case_history_details_complete
         */
        public void setCaseHistoryDetailsComplete(String caseHistoryDetailsComplete) {
            this.caseHistoryDetailsComplete = caseHistoryDetailsComplete;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsPresentingComplaint
         */
        public String getCaseGeneralDetailsPresentingComplaint() {
            return caseGeneralDetailsPresentingComplaint;
        }

        /**
         *
         * @param caseGeneralDetailsPresentingComplaint
         * The case_general_details_presenting_complaint
         */
        public void setCaseGeneralDetailsPresentingComplaint(String caseGeneralDetailsPresentingComplaint) {
            this.caseGeneralDetailsPresentingComplaint = caseGeneralDetailsPresentingComplaint;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsAge
         */
        public String getCaseGeneralDetailsAge() {
            return caseGeneralDetailsAge;
        }

        /**
         *
         * @param caseGeneralDetailsAge
         * The case_general_details_age
         */
        public void setCaseGeneralDetailsAge(String caseGeneralDetailsAge) {
            this.caseGeneralDetailsAge = caseGeneralDetailsAge;
        }

        /**
         *
         * @return
         * The caseInvestigationDetailsTemperatureRate
         */
        public String getCaseInvestigationDetailsTemperatureRate() {
            return caseInvestigationDetailsTemperatureRate;
        }

        /**
         *
         * @param caseInvestigationDetailsTemperatureRate
         * The case_investigation_details_temperature_rate
         */
        public void setCaseInvestigationDetailsTemperatureRate(String caseInvestigationDetailsTemperatureRate) {
            this.caseInvestigationDetailsTemperatureRate = caseInvestigationDetailsTemperatureRate;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsSymptoms
         */
        public String getCaseGeneralDetailsSymptoms() {
            return caseGeneralDetailsSymptoms;
        }

        /**
         *
         * @param caseGeneralDetailsSymptoms
         * The case_general_details_symptoms
         */
        public void setCaseGeneralDetailsSymptoms(String caseGeneralDetailsSymptoms) {
            this.caseGeneralDetailsSymptoms = caseGeneralDetailsSymptoms;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsDiabetesCheckedId
         */
        public String getCaseHistoryDetailsDiabetesCheckedId() {
            return caseHistoryDetailsDiabetesCheckedId;
        }

        /**
         *
         * @param caseHistoryDetailsDiabetesCheckedId
         * The case_history_details_diabetes_checked_id
         */
        public void setCaseHistoryDetailsDiabetesCheckedId(String caseHistoryDetailsDiabetesCheckedId) {
            this.caseHistoryDetailsDiabetesCheckedId = caseHistoryDetailsDiabetesCheckedId;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsAnySurgeriesRadio
         */
        public String getCaseHistoryDetailsAnySurgeriesRadio() {
            return caseHistoryDetailsAnySurgeriesRadio;
        }

        /**
         *
         * @param caseHistoryDetailsAnySurgeriesRadio
         * The case_history_details_any_surgeries_radio
         */
        public void setCaseHistoryDetailsAnySurgeriesRadio(String caseHistoryDetailsAnySurgeriesRadio) {
            this.caseHistoryDetailsAnySurgeriesRadio = caseHistoryDetailsAnySurgeriesRadio;
        }

        /**
         *
         * @return
         * The caseInvestigationDetailsPulseRate
         */
        public String getCaseInvestigationDetailsPulseRate() {
            return caseInvestigationDetailsPulseRate;
        }

        /**
         *
         * @param caseInvestigationDetailsPulseRate
         * The case_investigation_details_pulse_rate
         */
        public void setCaseInvestigationDetailsPulseRate(String caseInvestigationDetailsPulseRate) {
            this.caseInvestigationDetailsPulseRate = caseInvestigationDetailsPulseRate;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsSleepingPills
         */
        public String getCaseHistoryDetailsSleepingPills() {
            return caseHistoryDetailsSleepingPills;
        }

        /**
         *
         * @param caseHistoryDetailsSleepingPills
         * The case_history_details_sleeping_pills
         */
        public void setCaseHistoryDetailsSleepingPills(String caseHistoryDetailsSleepingPills) {
            this.caseHistoryDetailsSleepingPills = caseHistoryDetailsSleepingPills;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsAppetite
         */
        public String getCaseHistoryDetailsAppetite() {
            return caseHistoryDetailsAppetite;
        }

        /**
         *
         * @param caseHistoryDetailsAppetite
         * The case_history_details_appetite
         */
        public void setCaseHistoryDetailsAppetite(String caseHistoryDetailsAppetite) {
            this.caseHistoryDetailsAppetite = caseHistoryDetailsAppetite;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsDrinking
         */
        public String getCaseHistoryDetailsDrinking() {
            return caseHistoryDetailsDrinking;
        }

        /**
         *
         * @param caseHistoryDetailsDrinking
         * The case_history_details_drinking
         */
        public void setCaseHistoryDetailsDrinking(String caseHistoryDetailsDrinking) {
            this.caseHistoryDetailsDrinking = caseHistoryDetailsDrinking;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsSimilarComplaints
         */
        public String getCaseHistoryDetailsSimilarComplaints() {
            return caseHistoryDetailsSimilarComplaints;
        }

        /**
         *
         * @param caseHistoryDetailsSimilarComplaints
         * The case_history_details_similar_complaints
         */
        public void setCaseHistoryDetailsSimilarComplaints(String caseHistoryDetailsSimilarComplaints) {
            this.caseHistoryDetailsSimilarComplaints = caseHistoryDetailsSimilarComplaints;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsChewingTabacco
         */
        public String getCaseHistoryDetailsChewingTabacco() {
            return caseHistoryDetailsChewingTabacco;
        }

        /**
         *
         * @param caseHistoryDetailsChewingTabacco
         * The case_history_details_chewing_tabacco
         */
        public void setCaseHistoryDetailsChewingTabacco(String caseHistoryDetailsChewingTabacco) {
            this.caseHistoryDetailsChewingTabacco = caseHistoryDetailsChewingTabacco;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsOccupation
         */
        public String getCaseGeneralDetailsOccupation() {
            return caseGeneralDetailsOccupation;
        }

        /**
         *
         * @param caseGeneralDetailsOccupation
         * The case_general_details_occupation
         */
        public void setCaseGeneralDetailsOccupation(String caseGeneralDetailsOccupation) {
            this.caseGeneralDetailsOccupation = caseGeneralDetailsOccupation;
        }

        /**
         *
         * @return
         * The caseGeneralDetailsName
         */
        public String getCaseGeneralDetailsName() {
            return caseGeneralDetailsName;
        }

        /**
         *
         * @param caseGeneralDetailsName
         * The case_general_details_name
         */
        public void setCaseGeneralDetailsName(String caseGeneralDetailsName) {
            this.caseGeneralDetailsName = caseGeneralDetailsName;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsBowelBehaviour
         */
        public String getCaseHistoryDetailsBowelBehaviour() {
            return caseHistoryDetailsBowelBehaviour;
        }

        /**
         *
         * @param caseHistoryDetailsBowelBehaviour
         * The case_history_details_bowel_behaviour
         */
        public void setCaseHistoryDetailsBowelBehaviour(String caseHistoryDetailsBowelBehaviour) {
            this.caseHistoryDetailsBowelBehaviour = caseHistoryDetailsBowelBehaviour;
        }

        /**
         *
         * @return
         * The caseHistoryDetailsAnySurgeriesRadioCheckedId
         */
        public String getCaseHistoryDetailsAnySurgeriesRadioCheckedId() {
            return caseHistoryDetailsAnySurgeriesRadioCheckedId;
        }

        /**
         *
         * @param caseHistoryDetailsAnySurgeriesRadioCheckedId
         * The case_history_details_any_surgeries_radio_checked_id
         */
        public void setCaseHistoryDetailsAnySurgeriesRadioCheckedId(String caseHistoryDetailsAnySurgeriesRadioCheckedId) {
            this.caseHistoryDetailsAnySurgeriesRadioCheckedId = caseHistoryDetailsAnySurgeriesRadioCheckedId;
        }

        /**
         *
         * @return
         * The caseMedicationDetailsTreatmentUnderProcess
         */
        public String getCaseMedicationDetailsTreatmentUnderProcess() {
            return caseMedicationDetailsTreatmentUnderProcess;
        }

        /**
         *
         * @param caseMedicationDetailsTreatmentUnderProcess
         * The case_medication_details_treatment_under_process
         */
        public void setCaseMedicationDetailsTreatmentUnderProcess(String caseMedicationDetailsTreatmentUnderProcess) {
            this.caseMedicationDetailsTreatmentUnderProcess = caseMedicationDetailsTreatmentUnderProcess;
        }

        /**
         *
         * @return
         * The caseSystemicDetailsRespiratory
         */
        public String getCaseSystemicDetailsRespiratory() {
            return caseSystemicDetailsRespiratory;
        }

        /**
         *
         * @param caseSystemicDetailsRespiratory
         * The case_systemic_details_respiratory
         */
        public void setCaseSystemicDetailsRespiratory(String caseSystemicDetailsRespiratory) {
            this.caseSystemicDetailsRespiratory = caseSystemicDetailsRespiratory;
        }

        /**
         *
         * @return
         * The caseSystemicDetailsCarioVascular
         */
        public String getCaseSystemicDetailsCarioVascular() {
            return caseSystemicDetailsCarioVascular;
        }

        /**
         *
         * @param caseSystemicDetailsCarioVascular
         * The case_systemic_details_cario_vascular
         */
        public void setCaseSystemicDetailsCarioVascular(String caseSystemicDetailsCarioVascular) {
            this.caseSystemicDetailsCarioVascular = caseSystemicDetailsCarioVascular;
        }

        @Override
        public String toString() {
                return "AllDetails{" +
                        "caseInvestigationDetailsRespiratoryRate='" + caseInvestigationDetailsRespiratoryRate + '\'' +
                        ", caseHistoryDetailsHypertension='" + caseHistoryDetailsHypertension + '\'' +
                        ", caseHistoryDetailsSmoking='" + caseHistoryDetailsSmoking + '\'' +
                        ", caseMedicationDetailsComplete='" + caseMedicationDetailsComplete + '\'' +
                        ", caseSystemicDetailsAbdomen='" + caseSystemicDetailsAbdomen + '\'' +
                        ", caseMedicationDetailsPrescription='" + caseMedicationDetailsPrescription + '\'' +
                        ", caseGeneralDetailsNourishment='" + caseGeneralDetailsNourishment + '\'' +
                        ", caseInvestigationDetailsDiagnosis='" + caseInvestigationDetailsDiagnosis + '\'' +
                        ", caseHistoryDetailsSimilarComplaintsCheckedId='" + caseHistoryDetailsSimilarComplaintsCheckedId + '\'' +
                        ", caseSystemicDetailsPerCentralNervous='" + caseSystemicDetailsPerCentralNervous + '\'' +
                        ", caseHistoryDetailsAnySurgeries='" + caseHistoryDetailsAnySurgeries + '\'' +
                        ", caseGeneralDetailsComplete='" + caseGeneralDetailsComplete + '\'' +
                        ", caseGeneralDetailsMaritalStatusCheckedId='" + caseGeneralDetailsMaritalStatusCheckedId + '\'' +
                        ", caseSystemicDetailsComplete='" + caseSystemicDetailsComplete + '\'' +
                        ", caseMedicationDetailsSurgery='" + caseMedicationDetailsSurgery + '\'' +
                        ", caseGeneralDetailsHeadToToeExamination='" + caseGeneralDetailsHeadToToeExamination + '\'' +
                        ", caseGeneralDetailsSexCheckedId='" + caseGeneralDetailsSexCheckedId + '\'' +
                        ", caseGeneralDetailsSex='" + caseGeneralDetailsSex + '\'' +
                        ", caseGeneralDetailsBuild='" + caseGeneralDetailsBuild + '\'' +
                        ", caseGeneralDetailsMaritalStatus='" + caseGeneralDetailsMaritalStatus + '\'' +
                        ", caseHistoryDetailsSleep='" + caseHistoryDetailsSleep + '\'' +
                        ", caseHistoryDetailsFamilyHistory='" + caseHistoryDetailsFamilyHistory + '\'' +
                        ", caseGeneralDetailsEyes='" + caseGeneralDetailsEyes + '\'' +
                        ", caseInvestigationDetailsComplete='" + caseInvestigationDetailsComplete + '\'' +
                        ", caseHistoryDetailsDurg='" + caseHistoryDetailsDurg + '\'' +
                        ", caseHistoryDetailsHypertensionCheckedId='" + caseHistoryDetailsHypertensionCheckedId + '\'' +
                        ", caseHistoryDetailsDiabetes='" + caseHistoryDetailsDiabetes + '\'' +
                        ", caseCaseIdentifier='" + caseIdentifier + '\'' +
                        ", caseInvestigationDetailsBloodPressure='" + caseInvestigationDetailsBloodPressure + '\'' +
                        ", caseMediaDetailsComplete='" + caseMediaDetailsComplete + '\'' +
                        ", caseHistoryDetailsComplete='" + caseHistoryDetailsComplete + '\'' +
                        ", caseGeneralDetailsPresentingComplaint='" + caseGeneralDetailsPresentingComplaint + '\'' +
                        ", caseGeneralDetailsAge='" + caseGeneralDetailsAge + '\'' +
                        ", caseInvestigationDetailsTemperatureRate='" + caseInvestigationDetailsTemperatureRate + '\'' +
                        ", caseGeneralDetailsSymptoms='" + caseGeneralDetailsSymptoms + '\'' +
                        ", caseHistoryDetailsDiabetesCheckedId='" + caseHistoryDetailsDiabetesCheckedId + '\'' +
                        ", caseHistoryDetailsAnySurgeriesRadio='" + caseHistoryDetailsAnySurgeriesRadio + '\'' +
                        ", caseInvestigationDetailsPulseRate='" + caseInvestigationDetailsPulseRate + '\'' +
                        ", caseHistoryDetailsSleepingPills='" + caseHistoryDetailsSleepingPills + '\'' +
                        ", caseHistoryDetailsAppetite='" + caseHistoryDetailsAppetite + '\'' +
                        ", caseHistoryDetailsDrinking='" + caseHistoryDetailsDrinking + '\'' +
                        ", caseHistoryDetailsSimilarComplaints='" + caseHistoryDetailsSimilarComplaints + '\'' +
                        ", caseHistoryDetailsChewingTabacco='" + caseHistoryDetailsChewingTabacco + '\'' +
                        ", caseGeneralDetailsOccupation='" + caseGeneralDetailsOccupation + '\'' +
                        ", caseGeneralDetailsName='" + caseGeneralDetailsName + '\'' +
                        ", caseHistoryDetailsBowelBehaviour='" + caseHistoryDetailsBowelBehaviour + '\'' +
                        ", caseHistoryDetailsAnySurgeriesRadioCheckedId='" + caseHistoryDetailsAnySurgeriesRadioCheckedId + '\'' +
                        ", caseMedicationDetailsTreatmentUnderProcess='" + caseMedicationDetailsTreatmentUnderProcess + '\'' +
                        ", caseSystemicDetailsRespiratory='" + caseSystemicDetailsRespiratory + '\'' +
                        ", caseSystemicDetailsCarioVascular='" + caseSystemicDetailsCarioVascular + '\'' +
                        '}';
        }
}

