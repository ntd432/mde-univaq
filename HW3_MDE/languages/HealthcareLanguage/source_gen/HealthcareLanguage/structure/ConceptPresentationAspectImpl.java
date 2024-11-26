package HealthcareLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Appoinment;
  private ConceptPresentation props_Condition;
  private ConceptPresentation props_Department;
  private ConceptPresentation props_EducationalInstitute;
  private ConceptPresentation props_Employee;
  private ConceptPresentation props_EmployeeRole;
  private ConceptPresentation props_HealthcareEntity;
  private ConceptPresentation props_HealthcareSystem;
  private ConceptPresentation props_Hospital;
  private ConceptPresentation props_Observation;
  private ConceptPresentation props_Organization;
  private ConceptPresentation props_Patient;
  private ConceptPresentation props_Person;
  private ConceptPresentation props_Qualification;
  private ConceptPresentation props_Specialty;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Appoinment:
        if (props_Appoinment == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Appoinment = cpb.create();
        }
        return props_Appoinment;
      case LanguageConceptSwitch.Condition:
        if (props_Condition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Condition = cpb.create();
        }
        return props_Condition;
      case LanguageConceptSwitch.Department:
        if (props_Department == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Department = cpb.create();
        }
        return props_Department;
      case LanguageConceptSwitch.EducationalInstitute:
        if (props_EducationalInstitute == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_EducationalInstitute = cpb.create();
        }
        return props_EducationalInstitute;
      case LanguageConceptSwitch.Employee:
        if (props_Employee == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Employee = cpb.create();
        }
        return props_Employee;
      case LanguageConceptSwitch.EmployeeRole:
        if (props_EmployeeRole == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_EmployeeRole = cpb.create();
        }
        return props_EmployeeRole;
      case LanguageConceptSwitch.HealthcareEntity:
        if (props_HealthcareEntity == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_HealthcareEntity = cpb.create();
        }
        return props_HealthcareEntity;
      case LanguageConceptSwitch.HealthcareSystem:
        if (props_HealthcareSystem == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("HealthcareSystem");
          props_HealthcareSystem = cpb.create();
        }
        return props_HealthcareSystem;
      case LanguageConceptSwitch.Hospital:
        if (props_Hospital == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Hospital = cpb.create();
        }
        return props_Hospital;
      case LanguageConceptSwitch.Observation:
        if (props_Observation == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Observation = cpb.create();
        }
        return props_Observation;
      case LanguageConceptSwitch.Organization:
        if (props_Organization == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Organization = cpb.create();
        }
        return props_Organization;
      case LanguageConceptSwitch.Patient:
        if (props_Patient == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Patient = cpb.create();
        }
        return props_Patient;
      case LanguageConceptSwitch.Person:
        if (props_Person == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Person = cpb.create();
        }
        return props_Person;
      case LanguageConceptSwitch.Qualification:
        if (props_Qualification == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Qualification = cpb.create();
        }
        return props_Qualification;
      case LanguageConceptSwitch.Specialty:
        if (props_Specialty == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Specialty");
          props_Specialty = cpb.create();
        }
        return props_Specialty;
    }
    return null;
  }
}
