package HealthcareLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Objects;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class Department_Constraints extends BaseConstraintsDescriptor {
  public Department_Constraints() {
    super(CONCEPTS.Department$bm);
  }

  public static class Name_Property extends BasePropertyConstraintsDescriptor {
    public Name_Property(ConstraintsDescriptor container) {
      super(PROPS.name$MnvL, container, false, false, true);
    }
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castString(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(new SNodePointer("r:5b050995-38ca-45d9-8ebf-ae76aa376ae5(HealthcareLanguage.constraints)", "2595222810956367846"));
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, final String propertyValue) {
      return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(node, CONCEPTS.Hospital$Pv, false, false), LINKS.departments$qaiw)).where((it) -> Objects.equals(SPropertyOperations.getString(it, PROPS.name$MnvL), propertyValue)).count() <= 1;
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.name$MnvL, new Name_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Department$bm = MetaAdapterFactory.getConcept(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a0273L, "HealthcareLanguage.structure.Department");
    /*package*/ static final SConcept Hospital$Pv = MetaAdapterFactory.getConcept(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a028bL, "HealthcareLanguage.structure.Hospital");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink departments$qaiw = MetaAdapterFactory.getContainmentLink(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a028bL, 0x2f557f2e960a028eL, "departments");
  }
}