<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <reference id="1075010451642646892" name="defaultMember" index="1H5jkz" />
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="2XlvMUm2w8X">
    <property role="EcuMT" value="3410772130865480253" />
    <property role="TrG5h" value="Organization" />
    <property role="3GE5qa" value="Entities" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="1KTb4WhSJLI" resolve="HealthcareEntity" />
  </node>
  <node concept="1TIwiD" id="2XlvMUm2w8Z">
    <property role="EcuMT" value="3410772130865480255" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Appoinment" />
    <ref role="1TJDcQ" node="1KTb4WhSJLI" resolve="HealthcareEntity" />
    <node concept="1TJgyi" id="2XlvMUm2w90" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480256" />
      <property role="TrG5h" value="start" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2w91" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480257" />
      <property role="TrG5h" value="end" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2w92" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480258" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="2XlvMUm2w94" resolve="AppoinmentStatus" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2w93" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480259" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="2XlvMUm2w9b" resolve="AppointmentType" />
    </node>
    <node concept="1TJgyj" id="2XlvMUm2war" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480347" />
      <property role="20kJfa" value="practitioner" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2XlvMUm2w9T" resolve="Employee" />
    </node>
    <node concept="1TJgyj" id="1KTb4WhSJLC" role="1TKVEi">
      <property role="IQ2ns" value="2033705424848616552" />
      <property role="20kJfa" value="patient" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2XlvMUm2wam" resolve="Patient" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w94">
    <property role="3F6X1D" value="3410772130865480260" />
    <property role="TrG5h" value="AppoinmentStatus" />
    <property role="3GE5qa" value="Enumerations" />
    <ref role="1H5jkz" node="2XlvMUm2w95" resolve="Booked" />
    <node concept="25R33" id="2XlvMUm2w95" role="25R1y">
      <property role="3tVfz5" value="3410772130865480261" />
      <property role="TrG5h" value="Booked" />
    </node>
    <node concept="25R33" id="2XlvMUm2w96" role="25R1y">
      <property role="3tVfz5" value="3410772130865480262" />
      <property role="TrG5h" value="Arrived" />
    </node>
    <node concept="25R33" id="2XlvMUm2w97" role="25R1y">
      <property role="3tVfz5" value="3410772130865480263" />
      <property role="TrG5h" value="Fulfilled" />
    </node>
    <node concept="25R33" id="2XlvMUm2w98" role="25R1y">
      <property role="3tVfz5" value="3410772130865480264" />
      <property role="TrG5h" value="Cancelled" />
    </node>
    <node concept="25R33" id="2XlvMUm2w99" role="25R1y">
      <property role="3tVfz5" value="3410772130865480265" />
      <property role="TrG5h" value="NoShow" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w9b">
    <property role="3F6X1D" value="3410772130865480267" />
    <property role="3GE5qa" value="Enumerations" />
    <property role="TrG5h" value="AppointmentType" />
    <ref role="1H5jkz" node="2XlvMUm2w9c" resolve="Routine" />
    <node concept="25R33" id="2XlvMUm2w9c" role="25R1y">
      <property role="3tVfz5" value="3410772130865480268" />
      <property role="TrG5h" value="Routine" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9d" role="25R1y">
      <property role="3tVfz5" value="3410772130865480269" />
      <property role="TrG5h" value="Walking" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9e" role="25R1y">
      <property role="3tVfz5" value="3410772130865480270" />
      <property role="TrG5h" value="Checkup" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9f" role="25R1y">
      <property role="3tVfz5" value="3410772130865480271" />
      <property role="TrG5h" value="Followup" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9g" role="25R1y">
      <property role="3tVfz5" value="3410772130865480272" />
      <property role="TrG5h" value="Emergency" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w9h">
    <property role="3F6X1D" value="3410772130865480273" />
    <property role="3GE5qa" value="Enumerations" />
    <property role="TrG5h" value="ConditionSeverity" />
    <ref role="1H5jkz" node="2XlvMUm2w9j" resolve="Mild" />
    <node concept="25R33" id="2XlvMUm2w9j" role="25R1y">
      <property role="3tVfz5" value="3410772130865480275" />
      <property role="TrG5h" value="Mild" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9i" role="25R1y">
      <property role="3tVfz5" value="3410772130865480274" />
      <property role="TrG5h" value="Moderate" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9k" role="25R1y">
      <property role="3tVfz5" value="3410772130865480276" />
      <property role="TrG5h" value="Severe" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w9l">
    <property role="3F6X1D" value="3410772130865480277" />
    <property role="3GE5qa" value="Enumerations" />
    <property role="TrG5h" value="ConditionStatus" />
    <ref role="1H5jkz" node="2XlvMUm2w9m" resolve="Active" />
    <node concept="25R33" id="2XlvMUm2w9m" role="25R1y">
      <property role="3tVfz5" value="3410772130865480278" />
      <property role="TrG5h" value="Active" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9n" role="25R1y">
      <property role="3tVfz5" value="3410772130865480279" />
      <property role="TrG5h" value="Recurrence" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9o" role="25R1y">
      <property role="3tVfz5" value="3410772130865480280" />
      <property role="TrG5h" value="Inactive" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9p" role="25R1y">
      <property role="3tVfz5" value="3410772130865480281" />
      <property role="TrG5h" value="Resolved" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w9q">
    <property role="3F6X1D" value="3410772130865480282" />
    <property role="3GE5qa" value="Enumerations" />
    <property role="TrG5h" value="EmployeeSpecialty" />
    <ref role="1H5jkz" node="2XlvMUm2w9v" resolve="NA" />
    <node concept="25R33" id="2XlvMUm2w9s" role="25R1y">
      <property role="3tVfz5" value="3410772130865480284" />
      <property role="TrG5h" value="Cardiology" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9r" role="25R1y">
      <property role="3tVfz5" value="3410772130865480283" />
      <property role="TrG5h" value="Dermatology" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9t" role="25R1y">
      <property role="3tVfz5" value="3410772130865480285" />
      <property role="TrG5h" value="Neurology" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9u" role="25R1y">
      <property role="3tVfz5" value="3410772130865480286" />
      <property role="TrG5h" value="Pediatry" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9v" role="25R1y">
      <property role="3tVfz5" value="3410772130865480287" />
      <property role="TrG5h" value="NA" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w9x">
    <property role="3F6X1D" value="3410772130865480289" />
    <property role="3GE5qa" value="Enumerations" />
    <property role="TrG5h" value="ObservationType" />
    <node concept="25R33" id="2XlvMUm2w9y" role="25R1y">
      <property role="3tVfz5" value="3410772130865480290" />
      <property role="TrG5h" value="SpO2" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9z" role="25R1y">
      <property role="3tVfz5" value="3410772130865480291" />
      <property role="TrG5h" value="BloodPressure" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9$" role="25R1y">
      <property role="3tVfz5" value="3410772130865480292" />
      <property role="TrG5h" value="HeartRate" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9_" role="25R1y">
      <property role="3tVfz5" value="3410772130865480293" />
      <property role="TrG5h" value="XRay" />
    </node>
  </node>
  <node concept="25R3W" id="2XlvMUm2w9A">
    <property role="3F6X1D" value="3410772130865480294" />
    <property role="3GE5qa" value="Enumerations" />
    <property role="TrG5h" value="Role" />
    <ref role="1H5jkz" node="2XlvMUm2w9B" resolve="Doctor" />
    <node concept="25R33" id="2XlvMUm2w9B" role="25R1y">
      <property role="3tVfz5" value="3410772130865480295" />
      <property role="TrG5h" value="Doctor" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9C" role="25R1y">
      <property role="3tVfz5" value="3410772130865480296" />
      <property role="TrG5h" value="Nurse" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9D" role="25R1y">
      <property role="3tVfz5" value="3410772130865480297" />
      <property role="TrG5h" value="Pharmacist" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9E" role="25R1y">
      <property role="3tVfz5" value="3410772130865480298" />
      <property role="TrG5h" value="HospitalManager" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9F" role="25R1y">
      <property role="3tVfz5" value="3410772130865480299" />
      <property role="TrG5h" value="Janitor" />
    </node>
    <node concept="25R33" id="2XlvMUm2w9G" role="25R1y">
      <property role="3tVfz5" value="3410772130865480300" />
      <property role="TrG5h" value="Intern" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2w9I">
    <property role="EcuMT" value="3410772130865480302" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Condition" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="2XlvMUm2w9J" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2w9K" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480304" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="2XlvMUm2w9l" resolve="ConditionStatus" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2w9L" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480305" />
      <property role="TrG5h" value="severity" />
      <ref role="AX2Wp" node="2XlvMUm2w9h" resolve="ConditionSeverity" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2w9N">
    <property role="EcuMT" value="3410772130865480307" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Department" />
    <ref role="1TJDcQ" node="2XlvMUm2w8X" resolve="Organization" />
    <node concept="1TJgyj" id="2XlvMUm2w9O" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480308" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="staff" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2XlvMUm2w9P" resolve="EmployeeRole" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2w9P">
    <property role="EcuMT" value="3410772130865480309" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="EmployeeRole" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="2XlvMUm2w9Q" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2w9R" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480311" />
      <property role="TrG5h" value="role" />
      <ref role="AX2Wp" node="2XlvMUm2w9A" resolve="Role" />
    </node>
    <node concept="1TJgyj" id="1KTb4WhSJLE" role="1TKVEi">
      <property role="IQ2ns" value="2033705424848616554" />
      <property role="20kJfa" value="employee" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="2XlvMUm2w9T" resolve="Employee" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2w9T">
    <property role="EcuMT" value="3410772130865480313" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Employee" />
    <ref role="1TJDcQ" node="2XlvMUm2w9U" resolve="Person" />
    <node concept="1TJgyi" id="2XlvMUm2w9Y" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480318" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2XlvMUm2w9Z" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480319" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="qualifications" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2XlvMUm2wa0" resolve="Qualification" />
    </node>
    <node concept="1TJgyj" id="2YlWCeWA9zr" role="1TKVEi">
      <property role="IQ2ns" value="3428913338931255515" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="specialties" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2YlWCeWA9zp" resolve="Specialty" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2w9U">
    <property role="EcuMT" value="3410772130865480314" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Person" />
    <ref role="1TJDcQ" node="1KTb4WhSJLI" resolve="HealthcareEntity" />
    <node concept="1TJgyi" id="2XlvMUm2w9W" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480316" />
      <property role="TrG5h" value="gender" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2wa0">
    <property role="EcuMT" value="3410772130865480320" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Qualification" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="2XlvMUm2wa1" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2wa2" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480322" />
      <property role="TrG5h" value="issueDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2XlvMUm2wa3" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480323" />
      <property role="20kJfa" value="issuer" />
      <ref role="20lvS9" node="2XlvMUm2wa4" resolve="EducationalInstitute" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2wa4">
    <property role="EcuMT" value="3410772130865480324" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="EducationalInstitute" />
    <ref role="1TJDcQ" node="2XlvMUm2w8X" resolve="Organization" />
  </node>
  <node concept="1TIwiD" id="2XlvMUm2wab">
    <property role="EcuMT" value="3410772130865480331" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Hospital" />
    <ref role="1TJDcQ" node="2XlvMUm2w8X" resolve="Organization" />
    <node concept="1TJgyi" id="2XlvMUm2wad" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480333" />
      <property role="TrG5h" value="description" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="2XlvMUm2wae" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480334" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="departments" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2XlvMUm2w9N" resolve="Department" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2wag">
    <property role="EcuMT" value="3410772130865480336" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Observation" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyi" id="2XlvMUm2wah" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480337" />
      <property role="TrG5h" value="value" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="2XlvMUm2wai" role="1TKVEl">
      <property role="IQ2nx" value="3410772130865480338" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="2XlvMUm2w9x" resolve="ObservationType" />
    </node>
    <node concept="PrWs8" id="2XlvMUm2wak" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2XlvMUm2wam">
    <property role="EcuMT" value="3410772130865480342" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Patient" />
    <ref role="1TJDcQ" node="2XlvMUm2w9U" resolve="Person" />
    <node concept="1TJgyj" id="2XlvMUm2wan" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480343" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="observation" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2XlvMUm2wag" resolve="Observation" />
    </node>
    <node concept="1TJgyj" id="2XlvMUm2wao" role="1TKVEi">
      <property role="IQ2ns" value="3410772130865480344" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="condition" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="2XlvMUm2w9I" resolve="Condition" />
    </node>
  </node>
  <node concept="1TIwiD" id="2YlWCeWA9zp">
    <property role="EcuMT" value="3428913338931255513" />
    <property role="3GE5qa" value="Entities" />
    <property role="TrG5h" value="Specialty" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyi" id="2YlWCeWA9zq" role="1TKVEl">
      <property role="IQ2nx" value="3428913338931255514" />
      <property role="TrG5h" value="name" />
      <ref role="AX2Wp" node="2XlvMUm2w9q" resolve="EmployeeSpecialty" />
    </node>
  </node>
  <node concept="1TIwiD" id="1KTb4WhSJLG">
    <property role="EcuMT" value="2033705424848616556" />
    <property role="TrG5h" value="HealthcareSystem" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="1KTb4WhSJLM" role="1TKVEi">
      <property role="IQ2ns" value="2033705424848616562" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="entities" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="1KTb4WhSJLI" resolve="HealthcareEntity" />
    </node>
  </node>
  <node concept="1TIwiD" id="1KTb4WhSJLI">
    <property role="EcuMT" value="2033705424848616558" />
    <property role="TrG5h" value="HealthcareEntity" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="1KTb4WhSJLJ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
</model>

