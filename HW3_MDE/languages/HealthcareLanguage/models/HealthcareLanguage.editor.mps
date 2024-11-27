<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f4b7d499-a0dd-451e-baa3-c68c799b13da(HealthcareLanguage.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="5xrc" ref="r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ngI" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="2g45mm05VdG">
    <ref role="1XX52x" to="5xrc:1KTb4WhSJLG" resolve="HealthcareSystem" />
    <node concept="3EZMnI" id="2g45mm05Ve2" role="2wV5jI">
      <node concept="l2Vlx" id="2g45mm05Ve3" role="2iSdaV" />
      <node concept="3F0ifn" id="2g45mm05Ve4" role="3EZMnx">
        <property role="3F0ifm" value="healthcare system" />
        <node concept="VechU" id="2g45mm05Ven" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm05Ve5" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2g45mm05Ve6" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2g45mm05Ve7" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2g45mm05Ve8" role="3EZMnx">
        <node concept="l2Vlx" id="2g45mm05Ve9" role="2iSdaV" />
        <node concept="lj46D" id="2g45mm05Vea" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F2HdR" id="2g45mm05Vef" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:1KTb4WhSJLM" resolve="entities" />
          <node concept="l2Vlx" id="2g45mm05Veg" role="2czzBx" />
          <node concept="pj6Ft" id="2g45mm05Veh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="2g45mm05Vei" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm05Vej" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm05Vek" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2g45mm05Vel" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2g45mm06oNh">
    <ref role="1XX52x" to="5xrc:2XlvMUm2wam" resolve="Patient" />
    <node concept="3EZMnI" id="2g45mm06oNj" role="2wV5jI">
      <node concept="l2Vlx" id="2g45mm06oNk" role="2iSdaV" />
      <node concept="3F0ifn" id="2g45mm06oNl" role="3EZMnx">
        <property role="3F0ifm" value="Patient:" />
        <node concept="VechU" id="2g45mm06oNU" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
      </node>
      <node concept="3F0A7n" id="2g45mm06oNm" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2g45mm06oNV" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oNn" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2g45mm06oNo" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2g45mm06oNp" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2g45mm06oNq" role="3EZMnx">
        <node concept="l2Vlx" id="2g45mm06oNr" role="2iSdaV" />
        <node concept="lj46D" id="2g45mm06oNs" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oNt" role="3EZMnx">
          <property role="3F0ifm" value="gender" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oNu" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oNv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06oNw" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w9W" resolve="gender" />
          <node concept="ljvvj" id="2g45mm06oNx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oNy" role="3EZMnx">
          <node concept="ljvvj" id="2g45mm06oNz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oN$" role="3EZMnx">
          <property role="3F0ifm" value="observation" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oN_" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oNA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oNB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="2g45mm06oNC" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2wan" resolve="observation" />
          <node concept="l2Vlx" id="2g45mm06oND" role="2czzBx" />
          <node concept="pj6Ft" id="2g45mm06oNE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="2g45mm06oNF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oNG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oNH" role="3EZMnx">
          <node concept="ljvvj" id="2g45mm06oNI" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oNJ" role="3EZMnx">
          <property role="3F0ifm" value="condition" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oNK" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oNL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oNM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="2g45mm06oNN" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2wao" resolve="condition" />
          <node concept="l2Vlx" id="2g45mm06oNO" role="2czzBx" />
          <node concept="pj6Ft" id="2g45mm06oNP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="2g45mm06oNQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oNR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oNS" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2g45mm06oNT" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2g45mm06oNX">
    <ref role="1XX52x" to="5xrc:2XlvMUm2w9T" resolve="Employee" />
    <node concept="3EZMnI" id="2g45mm06oNZ" role="2wV5jI">
      <node concept="l2Vlx" id="2g45mm06oO0" role="2iSdaV" />
      <node concept="3F0ifn" id="2g45mm06oOF" role="3EZMnx">
        <property role="3F0ifm" value="Employee:" />
        <node concept="VechU" id="2g45mm06oOH" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
      </node>
      <node concept="3F0A7n" id="2g45mm06oO2" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2g45mm06oOI" role="3F10Kt">
          <property role="Vb096" value="fLwANPr/green" />
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oO3" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2g45mm06oO4" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2g45mm06oO5" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2g45mm06oO6" role="3EZMnx">
        <node concept="l2Vlx" id="2g45mm06oO7" role="2iSdaV" />
        <node concept="lj46D" id="2g45mm06oO8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oO9" role="3EZMnx">
          <property role="3F0ifm" value="description" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oOa" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oOb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06oOc" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w9Y" resolve="description" />
          <node concept="ljvvj" id="2g45mm06oOd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oOe" role="3EZMnx">
          <property role="3F0ifm" value="gender" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oOf" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oOg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06oOh" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w9W" resolve="gender" />
          <node concept="ljvvj" id="2g45mm06oOi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oOj" role="3EZMnx">
          <node concept="ljvvj" id="2g45mm06oOk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oOl" role="3EZMnx">
          <property role="3F0ifm" value="qualifications" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oOm" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oOn" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oOo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="2g45mm06oOp" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w9Z" resolve="qualifications" />
          <node concept="l2Vlx" id="2g45mm06oOq" role="2czzBx" />
          <node concept="pj6Ft" id="2g45mm06oOr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="2g45mm06oOs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oOt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oOu" role="3EZMnx">
          <node concept="ljvvj" id="2g45mm06oOv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oOw" role="3EZMnx">
          <property role="3F0ifm" value="specialties" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oOx" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oOy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oOz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="2g45mm06oO$" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2YlWCeWA9zr" resolve="specialties" />
          <node concept="l2Vlx" id="2g45mm06oO_" role="2czzBx" />
          <node concept="pj6Ft" id="2g45mm06oOA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="2g45mm06oOB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oOC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oOD" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2g45mm06oOE" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2g45mm06oOK">
    <ref role="1XX52x" to="5xrc:2XlvMUm2wa4" resolve="EducationalInstitute" />
    <node concept="3EZMnI" id="2g45mm06oOM" role="2wV5jI">
      <node concept="l2Vlx" id="2g45mm06oON" role="2iSdaV" />
      <node concept="3F0ifn" id="2g45mm06oOO" role="3EZMnx">
        <property role="3F0ifm" value="Educational institute:" />
        <node concept="VechU" id="2g45mm06oOS" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0A7n" id="2g45mm06oOP" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2g45mm06oOT" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oOQ" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="2g45mm06oOR" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2g45mm06oOV">
    <ref role="1XX52x" to="5xrc:2XlvMUm2wab" resolve="Hospital" />
    <node concept="3EZMnI" id="2g45mm06oOX" role="2wV5jI">
      <node concept="l2Vlx" id="2g45mm06oOY" role="2iSdaV" />
      <node concept="3F0ifn" id="2g45mm06oOZ" role="3EZMnx">
        <property role="3F0ifm" value="Hospital:" />
        <node concept="VechU" id="2g45mm06oPp" role="3F10Kt">
          <property role="Vb096" value="hGRnIZc/lightBlue" />
        </node>
      </node>
      <node concept="3F0A7n" id="2g45mm06oP0" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="2g45mm06oPq" role="3F10Kt">
          <property role="Vb096" value="hGRnIZc/lightBlue" />
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oP1" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2g45mm06oP2" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2g45mm06oP3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2g45mm06oP4" role="3EZMnx">
        <node concept="l2Vlx" id="2g45mm06oP5" role="2iSdaV" />
        <node concept="lj46D" id="2g45mm06oP6" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oP7" role="3EZMnx">
          <property role="3F0ifm" value="description" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oP8" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oP9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06oPa" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2wad" resolve="description" />
          <node concept="ljvvj" id="2g45mm06oPb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oPc" role="3EZMnx">
          <node concept="ljvvj" id="2g45mm06oPd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06oPe" role="3EZMnx">
          <property role="3F0ifm" value="departments" />
        </node>
        <node concept="3F0ifn" id="2g45mm06oPf" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06oPg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oPh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="2g45mm06oPi" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2wae" resolve="departments" />
          <node concept="l2Vlx" id="2g45mm06oPj" role="2czzBx" />
          <node concept="pj6Ft" id="2g45mm06oPk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="2g45mm06oPl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="2g45mm06oPm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06oPn" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2g45mm06oPo" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2g45mm06$my">
    <ref role="1XX52x" to="5xrc:2XlvMUm2w8Z" resolve="Appoinment" />
    <node concept="3EZMnI" id="2g45mm06$m$" role="2wV5jI">
      <node concept="l2Vlx" id="2g45mm06$m_" role="2iSdaV" />
      <node concept="3F0ifn" id="2g45mm06$mA" role="3EZMnx">
        <property role="3F0ifm" value="Appoinment:" />
        <node concept="VechU" id="2g45mm06$nl" role="3F10Kt">
          <property role="Vb096" value="fLwANPn/red" />
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06$mC" role="3EZMnx">
        <property role="3F0ifm" value="practitioner" />
      </node>
      <node concept="1iCGBv" id="2g45mm06$mD" role="3EZMnx">
        <ref role="1NtTu8" to="5xrc:2XlvMUm2war" resolve="practitioner" />
        <node concept="1sVBvm" id="2g45mm06$mG" role="1sWHZn">
          <node concept="3F0A7n" id="2g45mm06$mI" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06$nj" role="3EZMnx">
        <property role="3F0ifm" value="/" />
      </node>
      <node concept="3F0ifn" id="2g45mm06$mJ" role="3EZMnx">
        <property role="3F0ifm" value="patient" />
      </node>
      <node concept="1iCGBv" id="2g45mm06$mK" role="3EZMnx">
        <ref role="1NtTu8" to="5xrc:1KTb4WhSJLC" resolve="patient" />
        <node concept="1sVBvm" id="2g45mm06$mN" role="1sWHZn">
          <node concept="3F0A7n" id="2g45mm06$mP" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06$mQ" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="2g45mm06$mR" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="2g45mm06$mS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="2g45mm06$mT" role="3EZMnx">
        <node concept="l2Vlx" id="2g45mm06$mU" role="2iSdaV" />
        <node concept="lj46D" id="2g45mm06$mV" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="2g45mm06$mW" role="3EZMnx">
          <property role="3F0ifm" value="start" />
        </node>
        <node concept="3F0ifn" id="2g45mm06$mX" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06$mY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06$mZ" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w90" resolve="start" />
          <node concept="ljvvj" id="2g45mm06$n0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06$n1" role="3EZMnx">
          <property role="3F0ifm" value="end" />
        </node>
        <node concept="3F0ifn" id="2g45mm06$n2" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06$n3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06$n4" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w91" resolve="end" />
          <node concept="ljvvj" id="2g45mm06$n5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06$n6" role="3EZMnx">
          <property role="3F0ifm" value="status" />
        </node>
        <node concept="3F0ifn" id="2g45mm06$n7" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06$n8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06$n9" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w92" resolve="status" />
          <node concept="ljvvj" id="2g45mm06$na" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="2g45mm06$nb" role="3EZMnx">
          <property role="3F0ifm" value="type" />
        </node>
        <node concept="3F0ifn" id="2g45mm06$nc" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="2g45mm06$nd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="2g45mm06$ne" role="3EZMnx">
          <ref role="1NtTu8" to="5xrc:2XlvMUm2w93" resolve="type" />
          <node concept="ljvvj" id="2g45mm06$nf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2g45mm06$ng" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="2g45mm06$nh" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
</model>

