package HealthcareLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SReferenceLink;

public class EmployeeRole_SubstituteMenu extends SubstituteMenuBase {
  public EmployeeRole_SubstituteMenu() {
    super(false, new EditorMenuDescriptorBase("default substitute menu for EmployeeRole. Generated from implicit smart reference attribute.", new SNodePointer("r:e5bcaa7d-12f5-4ff3-b8b6-1218c56a72be(HealthcareLanguage.structure)", "3410772130865480309")));
  }
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SMP_ReferenceScope_kuskze_a(), CONCEPTS.EmployeeRole$ck));
    result.add(new SMP_Subconcepts_kuskze_b());
    return result;
  }

  public class SMP_ReferenceScope_kuskze_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_kuskze_a() {
      super(CONCEPTS.EmployeeRole$ck, LINKS.employee$O1ZJ, new EditorMenuDescriptorBase("reference scope substitute menu part", null));
    }

  }
  public class SMP_Subconcepts_kuskze_b extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    public SMP_Subconcepts_kuskze_b() {
      super(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "EmployeeRole", null));
    }

    @Override
    protected Collection<SAbstractConcept> getConcepts(final SubstituteMenuContext _context) {
      return getDirectDescendants(_context, CONCEPTS.EmployeeRole$ck);
    }

    @Override
    protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
      return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
    }
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept EmployeeRole$ck = MetaAdapterFactory.getConcept(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a0275L, "HealthcareLanguage.structure.EmployeeRole");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink employee$O1ZJ = MetaAdapterFactory.getReferenceLink(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a0275L, 0x1c392c4f11e2fc6aL, "employee");
  }
}