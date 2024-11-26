package HealthcareLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Appoinment = 0;
  public static final int Condition = 1;
  public static final int Department = 2;
  public static final int EducationalInstitute = 3;
  public static final int Employee = 4;
  public static final int EmployeeRole = 5;
  public static final int HealthcareSystem = 6;
  public static final int Hospital = 7;
  public static final int Observation = 8;
  public static final int Organization = 9;
  public static final int Patient = 10;
  public static final int Person = 11;
  public static final int Qualification = 12;
  public static final int Specialty = 13;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x7f0568a28c1a4091L, 0xa87e390be85922c7L);
    builder.put(0x2f557f2e960a023fL, Appoinment);
    builder.put(0x2f557f2e960a026eL, Condition);
    builder.put(0x2f557f2e960a0273L, Department);
    builder.put(0x2f557f2e960a0284L, EducationalInstitute);
    builder.put(0x2f557f2e960a0279L, Employee);
    builder.put(0x2f557f2e960a0275L, EmployeeRole);
    builder.put(0x2f95f283bc994d0aL, HealthcareSystem);
    builder.put(0x2f557f2e960a028bL, Hospital);
    builder.put(0x2f557f2e960a0290L, Observation);
    builder.put(0x2f557f2e960a023dL, Organization);
    builder.put(0x2f557f2e960a0296L, Patient);
    builder.put(0x2f557f2e960a027aL, Person);
    builder.put(0x2f557f2e960a0280L, Qualification);
    builder.put(0x2f95f283bc9898d9L, Specialty);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
