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
      <concept id="3428913338931255513" name="HealthcareLanguage.structure.Specialty" flags="ng" index="2j3mDq">
        <property id="3428913338931255514" name="name" index="2j3mDp" />
      </concept>
      <concept id="3410772130865480255" name="HealthcareLanguage.structure.Appoinment" flags="ng" index="2TnROh">
        <property id="3410772130865480258" name="status" index="2TnRPG" />
        <property id="3410772130865480259" name="type" index="2TnRPH" />
        <property id="3410772130865480256" name="start" index="2TnRPI" />
        <property id="3410772130865480257" name="end" index="2TnRPJ" />
        <reference id="3410772130865480347" name="practitioner" index="2TnRQP" />
        <child id="3410772130865480346" name="patient" index="2TnRQO" />
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
        <child id="3428913338931255515" name="specialty" index="2j3mDo" />
        <child id="3410772130865480319" name="qualifications" index="2TnRPh" />
      </concept>
      <concept id="3410772130865480309" name="HealthcareLanguage.structure.EmployeeRole" flags="ng" index="2TnRPr">
        <property id="3410772130865480311" name="role" index="2TnRPp" />
        <child id="3410772130865480312" name="employee" index="2TnRPm" />
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
  <node concept="2TnRQ_" id="4N9BueVaBA6">
    <property role="TrG5h" value="Coppito Clinic" />
    <property role="2TnRQz" value="This is a clinic located in Coppito, L'Aquila." />
    <node concept="2TnRPt" id="4N9BueVaBA7" role="2TnRQw">
      <property role="TrG5h" value="Maintenance Department" />
      <node concept="2TnRPr" id="4N9BueVaBA8" role="2TnRPq">
        <property role="TrG5h" value="Janitor" />
        <property role="2TnRPp" value="2XlvMUm2w9F/Janitor" />
        <node concept="2TnRPn" id="4N9BueVaBA9" role="2TnRPm">
          <property role="TrG5h" value="Vittorio" />
          <property role="2TnRPg" value="Daytime Janitor" />
          <property role="2TnRPi" value="true" />
        </node>
      </node>
    </node>
    <node concept="2TnRPt" id="4N9BueVaBAa" role="2TnRQw">
      <property role="TrG5h" value="Medical Department" />
      <node concept="2TnRPr" id="2YlWCeWAsUA" role="2TnRPq">
        <property role="TrG5h" value="Principal Doctor" />
        <node concept="2TnRPn" id="2YlWCeWAsUB" role="2TnRPm">
          <property role="TrG5h" value="Gladis" />
          <property role="2TnRPg" value="Gladis is the Principal Doctor." />
          <node concept="2j3mDq" id="2YlWCeWAsUE" role="2j3mDo">
            <property role="2j3mDp" value="2XlvMUm2w9t/Neurology" />
          </node>
          <node concept="2j3mDq" id="2YlWCeWAsUF" role="2j3mDo">
            <property role="2j3mDp" value="2XlvMUm2w9u/Pediatry" />
          </node>
          <node concept="2TnRQI" id="2YlWCeWAsUC" role="2TnRPh">
            <property role="TrG5h" value="Neurology" />
            <property role="2TnRQG" value="12/02/2002" />
            <ref role="2TnRQH" node="4N9BueVaBAi" resolve="Harvard Medical School" />
          </node>
          <node concept="2TnRQI" id="2YlWCeWAsUD" role="2TnRPh">
            <property role="TrG5h" value="Pediatry" />
            <property role="2TnRQG" value="06/11/2010" />
            <ref role="2TnRQH" node="4N9BueVaBAi" resolve="Harvard Medical School" />
          </node>
        </node>
      </node>
      <node concept="2TnRPr" id="4N9BueVaBAo" role="2TnRPq">
        <property role="TrG5h" value="Eric" />
        <property role="2TnRPp" value="2XlvMUm2w9C/Nurse" />
        <node concept="2TnRPn" id="4N9BueVaBAp" role="2TnRPm">
          <property role="2TnRPg" value="Eric is a nurse." />
          <property role="2TnRPi" value="true" />
          <property role="TrG5h" value="Main Nurse" />
          <node concept="2TnRQI" id="4N9BueVaBAq" role="2TnRPh">
            <property role="TrG5h" value="Nursing" />
            <property role="2TnRQG" value="09/05/2001" />
            <ref role="2TnRQH" node="4N9BueVaBAr" resolve="University of Pennsylvania" />
          </node>
        </node>
      </node>
      <node concept="2TnRPr" id="4N9BueVaBAu" role="2TnRPq">
        <property role="TrG5h" value="Melissa" />
        <property role="2TnRPp" value="2XlvMUm2w9G/Intern" />
        <node concept="2TnRPn" id="4N9BueVaBAv" role="2TnRPm">
          <property role="2TnRPg" value="Melissa is a medical intern." />
          <property role="TrG5h" value="Intern" />
        </node>
      </node>
    </node>
  </node>
  <node concept="2TnRQE" id="4N9BueVaBAi">
    <property role="TrG5h" value="Harvard Medical School" />
  </node>
  <node concept="2TnRQE" id="4N9BueVaBAr">
    <property role="TrG5h" value="University of Pennsylvania" />
  </node>
  <node concept="2TnROh" id="4N9BueVaMdN">
    <property role="2TnRPI" value="11/05/2024" />
    <property role="2TnRPG" value="2XlvMUm2w99/NoShow" />
    <property role="2TnRPJ" value="11/05/2024" />
    <ref role="2TnRQP" node="2YlWCeWAsUB" resolve="Gladis" />
    <node concept="2TnRQS" id="4N9BueVaMdO" role="2TnRQO">
      <property role="TrG5h" value="Prachi" />
      <node concept="2TnRP0" id="4N9BueVaMdS" role="2TnRQQ">
        <property role="TrG5h" value="Appendicitis" />
        <property role="2TnRPu" value="2XlvMUm2w9p/Resolved" />
        <property role="2TnRPv" value="2XlvMUm2w9i/Moderate" />
      </node>
      <node concept="2TnRP0" id="4N9BueVaMdW" role="2TnRQQ">
        <property role="TrG5h" value="Autism" />
        <property role="2TnRPv" value="2XlvMUm2w9k/Severe" />
      </node>
      <node concept="2TnRQY" id="4N9BueVaMdP" role="2TnRQT">
        <property role="TrG5h" value="MRI" />
        <property role="2TnRQW" value="2XlvMUm2w9_/XRay" />
        <property role="2TnRQZ" value="Normal" />
      </node>
    </node>
  </node>
  <node concept="2TnROh" id="4N9BueVaMe2">
    <property role="2TnRPI" value="23/09/2024" />
    <property role="2TnRPJ" value="23/09/2024" />
    <property role="2TnRPG" value="2XlvMUm2w96/Arrived" />
    <property role="2TnRPH" value="2XlvMUm2w9e/Checkup" />
    <ref role="2TnRQP" node="4N9BueVaBAp" resolve="Main Nurse" />
    <node concept="2TnRQS" id="4N9BueVaMe5" role="2TnRQO">
      <property role="TrG5h" value="David" />
      <property role="2TnRPi" value="true" />
      <node concept="2TnRP0" id="4N9BueVaMed" role="2TnRQQ">
        <property role="TrG5h" value="Hypertensive" />
        <property role="2TnRPv" value="2XlvMUm2w9k/Severe" />
      </node>
      <node concept="2TnRP0" id="4N9BueVaMeg" role="2TnRQQ">
        <property role="TrG5h" value="Asthma" />
        <property role="2TnRPu" value="2XlvMUm2w9n/Recurrence" />
        <property role="2TnRPv" value="2XlvMUm2w9i/Moderate" />
      </node>
      <node concept="2TnRQY" id="4N9BueVaMe7" role="2TnRQT">
        <property role="TrG5h" value="Heart Rate Measurement" />
        <property role="2TnRQZ" value="70" />
        <property role="2TnRQW" value="2XlvMUm2w9$/HeartRate" />
      </node>
      <node concept="2TnRQY" id="4N9BueVaMeb" role="2TnRQT">
        <property role="TrG5h" value="Blood Pressure Measurement" />
        <property role="2TnRQZ" value="120/80" />
        <property role="2TnRQW" value="2XlvMUm2w9z/BloodPressure" />
      </node>
    </node>
  </node>
</model>

