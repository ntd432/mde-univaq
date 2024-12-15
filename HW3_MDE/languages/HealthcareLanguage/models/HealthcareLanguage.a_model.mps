<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:fc18b8fd-574c-4044-a993-522be2149317(HealthcareLanguage.a_model)">
  <persistence version="9" />
  <languages>
    <use id="7f0568a2-8c1a-4091-a87e-390be85922c7" name="HealthcareLanguage" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports />
  <registry>
    <language id="7f0568a2-8c1a-4091-a87e-390be85922c7" name="HealthcareLanguage">
      <concept id="2033705424848616556" name="HealthcareLanguage.structure.HealthcareSystem" flags="ng" index="dQX0z">
        <child id="2033705424848616562" name="entities" index="dQX0X" />
      </concept>
      <concept id="3428913338931255513" name="HealthcareLanguage.structure.Specialty" flags="ng" index="2j3mDq">
        <property id="3428913338931255514" name="name" index="2j3mDp" />
      </concept>
      <concept id="3410772130865480255" name="HealthcareLanguage.structure.Appoinment" flags="ng" index="2TnROh">
        <property id="3410772130865480256" name="start" index="2TnRPI" />
        <property id="3410772130865480257" name="end" index="2TnRPJ" />
        <reference id="2033705424848616552" name="patient" index="dQX0B" />
        <reference id="3410772130865480347" name="practitioner" index="2TnRQP" />
      </concept>
      <concept id="3410772130865480302" name="HealthcareLanguage.structure.Condition" flags="ng" index="2TnRP0">
        <property id="3410772130865480304" name="status" index="2TnRPu" />
        <property id="3410772130865480305" name="severity" index="2TnRPv" />
      </concept>
      <concept id="3410772130865480314" name="HealthcareLanguage.structure.Person" flags="ng" index="2TnRPk">
        <property id="3410772130865480316" name="gender" index="2TnRPi" />
      </concept>
      <concept id="3410772130865480313" name="HealthcareLanguage.structure.Employee" flags="ng" index="2TnRPn">
        <property id="3410772130865480318" name="description" index="2TnRPg" />
        <child id="3428913338931255515" name="specialties" index="2j3mDo" />
        <child id="3410772130865480319" name="qualifications" index="2TnRPh" />
      </concept>
      <concept id="3410772130865480309" name="HealthcareLanguage.structure.EmployeeRole" flags="ng" index="2TnRPr">
        <property id="3410772130865480311" name="role" index="2TnRPp" />
        <reference id="2033705424848616554" name="employee" index="dQX0_" />
      </concept>
      <concept id="3410772130865480307" name="HealthcareLanguage.structure.Department" flags="ng" index="2TnRPt">
        <child id="3410772130865480308" name="staff" index="2TnRPq" />
      </concept>
      <concept id="3410772130865480331" name="HealthcareLanguage.structure.Hospital" flags="ng" index="2TnRQ_">
        <property id="3410772130865480333" name="description" index="2TnRQz" />
        <child id="3410772130865480334" name="departments" index="2TnRQw" />
      </concept>
      <concept id="3410772130865480324" name="HealthcareLanguage.structure.EducationalInstitute" flags="ng" index="2TnRQE" />
      <concept id="3410772130865480320" name="HealthcareLanguage.structure.Qualification" flags="ng" index="2TnRQI">
        <property id="3410772130865480322" name="issueDate" index="2TnRQG" />
        <reference id="3410772130865480323" name="issuer" index="2TnRQH" />
      </concept>
      <concept id="3410772130865480342" name="HealthcareLanguage.structure.Patient" flags="ng" index="2TnRQS">
        <child id="3410772130865480344" name="condition" index="2TnRQQ" />
        <child id="3410772130865480343" name="observation" index="2TnRQT" />
      </concept>
      <concept id="3410772130865480336" name="HealthcareLanguage.structure.Observation" flags="ng" index="2TnRQY">
        <property id="3410772130865480338" name="type" index="2TnRQW" />
        <property id="3410772130865480337" name="value" index="2TnRQZ" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="dQX0z" id="1KTb4WhSNJg">
    <node concept="2TnRQ_" id="1KTb4WhSQu2" role="dQX0X">
      <property role="TrG5h" value="Coppito Clinic" />
      <property role="2TnRQz" value="This is a clinic located in Coppito, L'Aquila." />
      <node concept="2TnRPt" id="1KTb4WhSQu3" role="2TnRQw">
        <property role="TrG5h" value="Maintenance Department" />
        <node concept="2TnRPr" id="1KTb4WhSYrG" role="2TnRPq">
          <property role="TrG5h" value="Janitor" />
          <property role="2TnRPp" value="2XlvMUm2w9F/Janitor" />
          <ref role="dQX0_" node="1KTb4WhSUs4" resolve="Vittorio" />
        </node>
      </node>
      <node concept="2TnRPt" id="1KTb4WhSYqD" role="2TnRQw">
        <property role="TrG5h" value="Medical Department" />
        <node concept="2TnRPr" id="1KTb4WhSYqE" role="2TnRPq">
          <property role="TrG5h" value="Principal Doctor" />
          <ref role="dQX0_" node="1KTb4WhSUsh" resolve="Gladis" />
        </node>
        <node concept="2TnRPr" id="1KTb4WhSYqF" role="2TnRPq">
          <property role="TrG5h" value="Nurse" />
          <property role="2TnRPp" value="2XlvMUm2w9C/Nurse" />
          <ref role="dQX0_" node="1KTb4WhSYqu" resolve="Eric" />
        </node>
        <node concept="2TnRPr" id="1KTb4WhSYqG" role="2TnRPq">
          <property role="TrG5h" value="Intern" />
          <property role="2TnRPp" value="2XlvMUm2w9G/Intern" />
          <ref role="dQX0_" node="1KTb4WhSUsa" resolve="Melissa" />
        </node>
      </node>
    </node>
    <node concept="2TnROh" id="1KTb4WhSYqI" role="dQX0X">
      <property role="TrG5h" value="Appointment-0" />
      <property role="2TnRPI" value="20/11/2024" />
      <property role="2TnRPJ" value="20/11/2024" />
      <ref role="2TnRQP" node="1KTb4WhSYqu" resolve="Eric" />
      <ref role="dQX0B" node="1KTb4WhSYr2" resolve="David" />
    </node>
    <node concept="2TnROh" id="1KTb4WhSYqM" role="dQX0X">
      <property role="TrG5h" value="Appointment-1" />
      <property role="2TnRPI" value="15/10/2024" />
      <property role="2TnRPJ" value="15/10/2024" />
      <ref role="2TnRQP" node="1KTb4WhSUsh" resolve="Gladis" />
      <ref role="dQX0B" node="1KTb4WhSYrh" resolve="Prachi" />
    </node>
    <node concept="2TnROh" id="1KTb4WhSYqP" role="dQX0X">
      <property role="TrG5h" value="Appointment-2" />
      <property role="2TnRPI" value="10/01/2024" />
      <property role="2TnRPJ" value="10/01/2024" />
      <ref role="2TnRQP" node="1KTb4WhSUsh" resolve="Gladis" />
      <ref role="dQX0B" node="1KTb4WhSYrw" resolve="Nakamura" />
    </node>
    <node concept="2TnROh" id="1KTb4WhSYqS" role="dQX0X">
      <property role="TrG5h" value="Appointment-3" />
      <property role="2TnRPI" value="05/04/2024" />
      <property role="2TnRPJ" value="05/04/2024" />
      <ref role="2TnRQP" node="1KTb4WhSUsa" resolve="Melissa" />
      <ref role="dQX0B" node="1KTb4WhSYrw" resolve="Nakamura" />
    </node>
    <node concept="2TnROh" id="1KTb4WhSYqV" role="dQX0X">
      <property role="TrG5h" value="Appointment-4" />
      <property role="2TnRPI" value="13/05/2024" />
      <property role="2TnRPJ" value="13/05/2024" />
      <ref role="2TnRQP" node="1KTb4WhSUsh" resolve="Gladis" />
      <ref role="dQX0B" node="1KTb4WhSYrw" resolve="Nakamura" />
    </node>
    <node concept="2TnRPn" id="1KTb4WhSUs4" role="dQX0X">
      <property role="TrG5h" value="Vittorio" />
      <property role="2TnRPg" value="Vittorio, a seasoned janitor with over 15 years of experience, is known for his meticulous attention to detail and dedication to maintaining a clean, safe, and welcoming environment at the hospital, contributing significantly to the well-being of patients, staff, and visitors alike." />
      <property role="2TnRPi" value="true" />
      <node concept="2j3mDq" id="1KTb4WhSUs8" role="2j3mDo" />
    </node>
    <node concept="2TnRPn" id="1KTb4WhSUsa" role="dQX0X">
      <property role="TrG5h" value="Melissa" />
      <property role="2TnRPg" value="Melissa, a diligent intern at the hospital, is eager to learn and contribute, supporting medical teams with enthusiasm and a strong commitment to patient care." />
      <node concept="2j3mDq" id="1KTb4WhSUsf" role="2j3mDo" />
    </node>
    <node concept="2TnRPn" id="1KTb4WhSUsh" role="dQX0X">
      <property role="TrG5h" value="Gladis" />
      <property role="2TnRPg" value="Gladis has two degrees from Havard Medical Schools" />
      <node concept="2j3mDq" id="1KTb4WhSUsw" role="2j3mDo">
        <property role="2j3mDp" value="2XlvMUm2w9t/Neurology" />
      </node>
      <node concept="2j3mDq" id="1KTb4WhSUsx" role="2j3mDo">
        <property role="2j3mDp" value="2XlvMUm2w9u/Pediatry" />
      </node>
      <node concept="2TnRQI" id="1KTb4WhSUsm" role="2TnRPh">
        <property role="TrG5h" value="Neurologist" />
        <property role="2TnRQG" value="06/11/2000" />
        <ref role="2TnRQH" node="1KTb4WhSUsp" resolve="Harvard Medical School" />
      </node>
      <node concept="2TnRQI" id="1KTb4WhSYqq" role="2TnRPh">
        <property role="TrG5h" value="Peditrician" />
        <property role="2TnRQG" value="06/11/2005" />
        <ref role="2TnRQH" node="1KTb4WhSUsp" resolve="Harvard Medical School" />
      </node>
    </node>
    <node concept="2TnRPn" id="1KTb4WhSYqu" role="dQX0X">
      <property role="TrG5h" value="Eric" />
      <property role="2TnRPg" value="Eric, born in 2000, obtained his nursing degree from UPen in 2020" />
      <property role="2TnRPi" value="true" />
      <node concept="2j3mDq" id="1KTb4WhSYqz" role="2j3mDo" />
      <node concept="2TnRQI" id="1KTb4WhSYqx" role="2TnRPh">
        <property role="TrG5h" value="Nursing" />
        <property role="2TnRQG" value="20/07/2020" />
        <ref role="2TnRQH" node="1KTb4WhSUss" resolve="University of Pennsylvania" />
      </node>
    </node>
    <node concept="2TnRQS" id="1KTb4WhSYr2" role="dQX0X">
      <property role="TrG5h" value="David" />
      <property role="2TnRPi" value="true" />
      <node concept="2TnRP0" id="1KTb4WhSYrb" role="2TnRQQ">
        <property role="TrG5h" value="Hypertensive" />
        <property role="2TnRPv" value="2XlvMUm2w9k/Severe" />
      </node>
      <node concept="2TnRP0" id="1KTb4WhSYrc" role="2TnRQQ">
        <property role="TrG5h" value="Asthma" />
        <property role="2TnRPu" value="2XlvMUm2w9n/Recurrence" />
        <property role="2TnRPv" value="2XlvMUm2w9i/Moderate" />
      </node>
      <node concept="2TnRQY" id="1KTb4WhSYr5" role="2TnRQT">
        <property role="TrG5h" value="Blood Pressure Observation" />
        <property role="2TnRQZ" value="120/80" />
        <property role="2TnRQW" value="2XlvMUm2w9z/BloodPressure" />
      </node>
      <node concept="2TnRQY" id="1KTb4WhSYr6" role="2TnRQT">
        <property role="TrG5h" value="Heart Rate Measurement" />
        <property role="2TnRQZ" value="70/100" />
        <property role="2TnRQW" value="2XlvMUm2w9$/HeartRate" />
      </node>
    </node>
    <node concept="2TnRQS" id="1KTb4WhSYrh" role="dQX0X">
      <property role="TrG5h" value="Prachi" />
      <node concept="2TnRP0" id="1KTb4WhSYrl" role="2TnRQQ">
        <property role="TrG5h" value="Appendicitis" />
        <property role="2TnRPu" value="2XlvMUm2w9p/Resolved" />
        <property role="2TnRPv" value="2XlvMUm2w9i/Moderate" />
      </node>
      <node concept="2TnRP0" id="1KTb4WhSYrm" role="2TnRQQ">
        <property role="TrG5h" value="Autism" />
        <property role="2TnRPv" value="2XlvMUm2w9k/Severe" />
      </node>
      <node concept="2TnRP0" id="1KTb4WhSYrn" role="2TnRQQ">
        <property role="TrG5h" value="Pyromania" />
        <property role="2TnRPu" value="2XlvMUm2w9p/Resolved" />
      </node>
      <node concept="2TnRQY" id="1KTb4WhSYrk" role="2TnRQT">
        <property role="TrG5h" value="MRI" />
        <property role="2TnRQZ" value="Normal" />
        <property role="2TnRQW" value="2XlvMUm2w9_/XRay" />
      </node>
    </node>
    <node concept="2TnRQS" id="1KTb4WhSYrw" role="dQX0X">
      <property role="TrG5h" value="Nakamura" />
      <node concept="2TnRQY" id="1KTb4WhSYr_" role="2TnRQT">
        <property role="TrG5h" value="Heart Rate Measurement" />
        <property role="2TnRQZ" value="60/120" />
        <property role="2TnRQW" value="2XlvMUm2w9$/HeartRate" />
      </node>
      <node concept="2TnRP0" id="1KTb4WhSYrz" role="2TnRQQ">
        <property role="TrG5h" value="Food allergy diet" />
        <property role="2TnRPu" value="2XlvMUm2w9n/Recurrence" />
      </node>
    </node>
    <node concept="2TnRQE" id="1KTb4WhSUsp" role="dQX0X">
      <property role="TrG5h" value="Harvard Medical School" />
    </node>
    <node concept="2TnRQE" id="1KTb4WhSUss" role="dQX0X">
      <property role="TrG5h" value="University of Pennsylvania" />
    </node>
  </node>
</model>

