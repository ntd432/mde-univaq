<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:fda4454b-9001-4a75-a0b0-27225ba663b8(HealthcareLanguage.feedback)">
  <persistence version="9" />
  <languages>
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="7127d409-29f0-43e8-917f-f016ea288944" name="jetbrains.mps.lang.feedback.problem.structural" version="0" />
    <use id="517077fd-e44f-4338-a475-1d29781dfdb8" name="jetbrains.mps.lang.feedback.skeleton" version="0" />
    <use id="16e76fe3-9534-4def-afb7-925a169a7c0b" name="jetbrains.mps.lang.feedback.messages" version="0" />
    <use id="033598a4-76a9-47e1-ac89-a300c0fceab8" name="jetbrains.mps.lang.feedback.problem" version="0" />
    <use id="cddf55b3-117e-46ec-837c-ff50eb7b89b0" name="jetbrains.mps.lang.feedback.problem.childAndProp" version="0" />
    <use id="cd17a113-ca4e-472f-a8de-c49008f9eea8" name="jetbrains.mps.lang.feedback" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="feec32f9-bc8f-4da8-8efd-7f3f9dd4101b" name="jetbrains.mps.lang.feedback.problem.scopes" version="0" />
    <devkit ref="0845ddb4-34c2-4a32-b2ae-270bffc5b430(jetbrains.mps.devkit.aspect.feedback)" />
  </languages>
  <imports>
    <import index="fudv" ref="r:9006e6ce-991d-45e3-a20f-0deb45783955(jetbrains.mps.lang.feedback.problem.childAndProp.feedback)" />
    <import index="5xrc" ref="r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)" />
  </imports>
  <registry>
    <language id="033598a4-76a9-47e1-ac89-a300c0fceab8" name="jetbrains.mps.lang.feedback.problem">
      <concept id="7716791493892884282" name="jetbrains.mps.lang.feedback.problem.structure.ProblemPointsToKindRoot" flags="ng" index="sa$J0">
        <reference id="7716791493892884283" name="kind" index="sa$J1" />
      </concept>
    </language>
    <language id="cd17a113-ca4e-472f-a8de-c49008f9eea8" name="jetbrains.mps.lang.feedback">
      <concept id="6285588811486118729" name="jetbrains.mps.lang.feedback.structure.Feedback" flags="ngI" index="3JXyrL">
        <child id="6285588811486118732" name="problem" index="3JXyrO" />
      </concept>
    </language>
    <language id="cddf55b3-117e-46ec-837c-ff50eb7b89b0" name="jetbrains.mps.lang.feedback.problem.childAndProp">
      <concept id="24399255755597574" name="jetbrains.mps.lang.feedback.problem.childAndProp.structure.FailingPropertyConstraintsProblem" flags="ng" index="1GjwBS">
        <reference id="24399255755615671" name="property" index="1Gj$d9" />
      </concept>
    </language>
    <language id="16e76fe3-9534-4def-afb7-925a169a7c0b" name="jetbrains.mps.lang.feedback.messages">
      <concept id="7291380803381892689" name="jetbrains.mps.lang.feedback.messages.structure.ShowMessage" flags="ng" index="3QByp$">
        <child id="5258059200641510856" name="message" index="16N$OO" />
      </concept>
    </language>
    <language id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages">
      <concept id="5258059200642172255" name="jetbrains.mps.lang.messages.structure.CombinedMessageExpression" flags="ng" index="16I2mz">
        <child id="5258059200642172257" name="part" index="16I2mt" />
      </concept>
      <concept id="5258059200641510853" name="jetbrains.mps.lang.messages.structure.LiteralMessageExpression" flags="ng" index="16N$OT">
        <property id="5258059200641510854" name="message" index="16N$OU" />
      </concept>
    </language>
    <language id="517077fd-e44f-4338-a475-1d29781dfdb8" name="jetbrains.mps.lang.feedback.skeleton">
      <concept id="7291380803381892615" name="jetbrains.mps.lang.feedback.skeleton.structure.FeedbackPerConceptRoot" flags="ng" index="3QByoM">
        <reference id="7188575577281228125" name="concept" index="3Z9TSV" />
        <child id="7291380803381927154" name="feedbacks" index="3QBEN7" />
      </concept>
    </language>
  </registry>
  <node concept="3QByoM" id="4N9BueVaZQg">
    <ref role="3Z9TSV" to="5xrc:2XlvMUm2w8Z" resolve="Appoinment" />
    <node concept="3QByp$" id="4N9BueVaZQW" role="3QBEN7">
      <node concept="16I2mz" id="4N9BueVaZQX" role="16N$OO">
        <node concept="16N$OT" id="2YlWCeWOf6Z" role="16I2mt">
          <property role="16N$OU" value="&quot;Please use a DD/MM/YYYY date format and make sure the end date is not before start date.&quot;" />
        </node>
      </node>
      <node concept="1GjwBS" id="4N9BueVaZQU" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="5xrc:2XlvMUm2w91" resolve="end" />
      </node>
    </node>
    <node concept="3QByp$" id="4N9BueVaZQm" role="3QBEN7">
      <node concept="16I2mz" id="4N9BueVaZQn" role="16N$OO">
        <node concept="16N$OT" id="2YlWCeWOfhK" role="16I2mt">
          <property role="16N$OU" value="&quot;Please use a DD/MM/YYYY date format." />
        </node>
        <node concept="16N$OT" id="2YlWCeWOfhL" role="16I2mt">
          <property role="16N$OU" value="&quot;" />
        </node>
        <node concept="16N$OT" id="4N9BueVaZQS" role="16I2mt">
          <property role="16N$OU" value="" />
        </node>
      </node>
      <node concept="1GjwBS" id="4N9BueVaZQi" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="5xrc:2XlvMUm2w90" resolve="start" />
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="4N9BueVaZRa">
    <ref role="3Z9TSV" to="5xrc:2XlvMUm2wa0" resolve="Qualification" />
    <node concept="3QByp$" id="4N9BueVaZRc" role="3QBEN7">
      <node concept="16I2mz" id="4N9BueVaZRd" role="16N$OO">
        <node concept="16N$OT" id="4N9BueVaZRe" role="16I2mt">
          <property role="16N$OU" value="&quot;Please use a DD/MM/YYYY date format.&quot;" />
        </node>
      </node>
      <node concept="1GjwBS" id="4N9BueVaZRb" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="5xrc:2XlvMUm2wa2" resolve="issueDate" />
      </node>
    </node>
  </node>
</model>

