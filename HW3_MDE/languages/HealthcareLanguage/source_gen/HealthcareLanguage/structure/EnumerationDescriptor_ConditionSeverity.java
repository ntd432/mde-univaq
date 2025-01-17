package HealthcareLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_ConditionSeverity extends EnumerationDescriptorBase {

  public EnumerationDescriptor_ConditionSeverity() {
    super(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a0251L, "ConditionSeverity", "r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)/3410772130865480273");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_Mild_0 = new EnumerationDescriptor.MemberDescriptor("Mild", "Mild", 0x2f557f2e960a0253L, "r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)/3410772130865480275");
  private final EnumerationDescriptor.MemberDescriptor myMember_Moderate_0 = new EnumerationDescriptor.MemberDescriptor("Moderate", "Moderate", 0x2f557f2e960a0252L, "r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)/3410772130865480274");
  private final EnumerationDescriptor.MemberDescriptor myMember_Severe_0 = new EnumerationDescriptor.MemberDescriptor("Severe", "Severe", 0x2f557f2e960a0254L, "r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)/3410772130865480276");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a0251L, 0x2f557f2e960a0253L, 0x2f557f2e960a0252L, 0x2f557f2e960a0254L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_Mild_0, myMember_Moderate_0, myMember_Severe_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_Mild_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "Mild":
        return myMember_Mild_0;
      case "Moderate":
        return myMember_Moderate_0;
      case "Severe":
        return myMember_Severe_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
