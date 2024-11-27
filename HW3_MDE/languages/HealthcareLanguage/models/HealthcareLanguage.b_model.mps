<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:9433b387-4460-45d6-b4ab-006e7d1b27c0(HealthcareLanguage.b_model)">
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
        <property id="3410772130865480259" name="type" index="2TnRPH" />
        <property id="3410772130865480256" name="start" index="2TnRPI" />
        <property id="3410772130865480257" name="end" index="2TnRPJ" />
        <reference id="2033705424848616552" name="patient" index="dQX0B" />
        <reference id="3410772130865480347" name="practitioner" index="2TnRQP" />
      </concept>
      <concept id="3410772130865480302" name="HealthcareLanguage.structure.Condition" flags="ng" index="2TnRP0">
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
  <node concept="dQX0z" id="2g45mm029YN">
    <node concept="2TnRQ_" id="2g45mm029YQ" role="dQX0X">
      <property role="TrG5h" value="James Hospital" />
      <property role="2TnRQz" value="This is James Hospital located in SFO, California." />
      <node concept="2TnRPt" id="2g45mm029YV" role="2TnRQw">
        <property role="TrG5h" value="Management Department" />
        <node concept="2TnRPr" id="2g45mm029YX" role="2TnRPq">
          <property role="TrG5h" value="Hospital Manager" />
          <property role="2TnRPp" value="2XlvMUm2w9E/HospitalManager" />
          <ref role="dQX0_" node="2g45mm02syN" resolve="Daniela" />
        </node>
      </node>
      <node concept="2TnRPt" id="2g45mm02syF" role="2TnRQw">
        <property role="TrG5h" value="Cardiology Department" />
        <node concept="2TnRPr" id="2g45mm02syK" role="2TnRPq">
          <property role="TrG5h" value="Resident Doctor" />
          <ref role="dQX0_" node="2g45mm02syZ" resolve="James" />
        </node>
      </node>
    </node>
    <node concept="2TnROh" id="2g45mm02szh" role="dQX0X">
      <property role="TrG5h" value="Appointment_0" />
      <property role="2TnRPH" value="2XlvMUm2w9e/Checkup" />
      <property role="2TnRPI" value="06/11/2024" />
      <property role="2TnRPJ" value="06/11/2024" />
      <ref role="2TnRQP" node="2g45mm02syZ" resolve="James" />
      <ref role="dQX0B" node="2g45mm02sz7" resolve="Jorge" />
    </node>
    <node concept="2TnRQS" id="2g45mm02sz7" role="dQX0X">
      <property role="TrG5h" value="Jorge" />
      <property role="2TnRPi" value="true" />
      <node concept="2TnRP0" id="2g45mm02szd" role="2TnRQQ">
        <property role="TrG5h" value="Diabetes" />
        <property role="2TnRPv" value="2XlvMUm2w9k/Severe" />
      </node>
      <node concept="2TnRQY" id="2g45mm02sza" role="2TnRQT">
        <property role="TrG5h" value="SpO2 Observation" />
        <property role="2TnRQZ" value="120" />
        <property role="2TnRQW" value="2XlvMUm2w9y/SpO2" />
      </node>
    </node>
    <node concept="2TnRPn" id="2g45mm02syZ" role="dQX0X">
      <property role="TrG5h" value="James" />
      <property role="2TnRPg" value="James is a hardworking doctor." />
      <property role="2TnRPi" value="true" />
      <node concept="2j3mDq" id="2g45mm02sz3" role="2j3mDo">
        <property role="2j3mDp" value="2XlvMUm2w9s/Cardiology" />
      </node>
      <node concept="2TnRQI" id="2g45mm02sz1" role="2TnRPh">
        <property role="TrG5h" value="Cardiology" />
        <property role="2TnRQG" value="08/05/2024" />
        <ref role="2TnRQH" node="2g45mm02syT" resolve="UNIVAQ" />
      </node>
    </node>
    <node concept="2TnRPn" id="2g45mm02syN" role="dQX0X">
      <property role="TrG5h" value="Daniela" />
      <property role="2TnRPg" value="Daniela was born in 1989." />
      <node concept="2TnRQI" id="2g45mm02syP" role="2TnRPh">
        <property role="TrG5h" value="MBA" />
        <property role="2TnRQG" value="06/11/2024" />
        <ref role="2TnRQH" node="2g45mm02syT" resolve="UNIVAQ" />
      </node>
    </node>
    <node concept="2TnRQE" id="2g45mm02syT" role="dQX0X">
      <property role="TrG5h" value="UNIVAQ" />
    </node>
  </node>
</model>

