package Mining.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import Mining.behavior.Sensor_Type__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.ListScope;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Check_Point_Event_Constraints extends BaseConstraintsDescriptor {
  public Check_Point_Event_Constraints() {
    super(CONCEPTS.Check_Point_Event$rV);
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    BaseReferenceConstraintsDescriptor d0 = new BaseReferenceConstraintsDescriptor(LINKS.sensorType$29GL, this, true, false) {
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return new SNodePointer("r:ef5b13d7-d5e8-4ebf-a18f-76c256afe20a(Mining.constraints)", "6785145254859667497");
          }
          @Override
          public Scope createScope(final ReferenceConstraintsContext _context) {
            final Iterable<SNode> stypes = ListSequence.fromList(SModelOperations.nodes(SNodeOperations.getModel(_context.getContextNode()), CONCEPTS.Sensor_Type$$o)).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode it) {
                return (boolean) Sensor_Type__BehaviorDescriptor.checkPoint_id5SDFqzTmf_L.invoke(it, SLinkOperations.getTarget(_context.getReferenceNode(), LINKS.checkPoint$29eJ));
              }
            });
            return ListScope.forNamedElements(stypes);
          }
        };
      }
    };
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(d0.getReference(), d0);
    return references;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Check_Point_Event$rV = MetaAdapterFactory.getConcept(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL, "Mining.structure.Check_Point_Event");
    /*package*/ static final SConcept Sensor_Type$$o = MetaAdapterFactory.getConcept(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859b3L, "Mining.structure.Sensor_Type");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink sensorType$29GL = MetaAdapterFactory.getReferenceLink(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL, 0x5e29ada8f924f740L, "sensorType");
    /*package*/ static final SReferenceLink checkPoint$29eJ = MetaAdapterFactory.getReferenceLink(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL, 0x5e29ada8f924f73eL, "checkPoint");
  }
}
