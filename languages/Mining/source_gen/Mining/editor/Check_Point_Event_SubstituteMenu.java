package Mining.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuItem;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import jetbrains.mps.smodel.ConceptDescendantsCache;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Check_Point_Event_SubstituteMenu extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SMP_ReferenceScope_oe6dsy_a(), CONCEPTS.Check_Point_Event$rV));
    result.add(new SMP_Subconcepts_oe6dsy_b());
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("default substitute menu for Check_Point_Event. Generated from the smart reference attribute.", new SNodePointer("r:589c5fd8-b628-4aae-9e87-31a99b5068a7(Mining.structure)", "6785145254857923877")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  public class SMP_ReferenceScope_oe6dsy_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_oe6dsy_a() {
      // that cast is needed for prevent the users from https://youtrack.jetbrains.com/issue/MPS-29051
      super((SAbstractConcept) CONCEPTS.Check_Point_Event$rV, LINKS.checkPoint$29eJ);
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("reference scope substitute menu part", null));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    @NotNull
    protected ReferenceScopeSubstituteMenuItem createItem(SubstituteMenuContext context, SNode referencedNode) {
      return new Item(context, referencedNode, getSConcept(), getReferenceLink());
    }
    private class Item extends ReferenceScopeSubstituteMenuItem {
      private final SubstituteMenuContext _context;
      private final SNode referencedNode;
      private EditorMenuTraceInfo myTraceInfo;

      private Item(SubstituteMenuContext context, SNode refNode, SAbstractConcept concept, SReferenceLink referenceLink) {
        super(concept, context, refNode, referenceLink);
        _context = context;
        referencedNode = refNode;
        myTraceInfo = context.getEditorMenuTrace().getTraceInfo();
      }
      @Override
      public String getMatchingText(String pattern) {
        return "" + NodePresentationUtil.matchingText(getReferent(), getParentNode(), false) + "";
      }
      @Override
      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myTraceInfo;
      }
    }
  }
  public class SMP_Subconcepts_oe6dsy_b extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    protected Collection getConcepts(final SubstituteMenuContext _context) {
      return ConceptDescendantsCache.getInstance().getDirectDescendants(CONCEPTS.Check_Point_Event$rV);
    }
    @NotNull
    @Override
    public List<SubstituteMenuItem> createItems(SubstituteMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "Check_Point_Event", null));
      try {
        return super.createItems(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }

    @Override
    protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
      return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
    }
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Check_Point_Event$rV = MetaAdapterFactory.getConcept(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL, "Mining.structure.Check_Point_Event");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink checkPoint$29eJ = MetaAdapterFactory.getReferenceLink(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL, 0x5e29ada8f924f73eL, "checkPoint");
  }
}
