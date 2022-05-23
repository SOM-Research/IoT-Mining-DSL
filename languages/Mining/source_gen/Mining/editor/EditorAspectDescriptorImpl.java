package Mining.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import jetbrains.mps.openapi.editor.descriptor.EditorHintsProvider;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorHint;
import java.util.Arrays;
import jetbrains.mps.editor.runtime.descriptor.ConceptEditorHintImpl;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase implements EditorHintsProvider {
  private Collection<ConceptEditorHint> myHints = Arrays.<ConceptEditorHint>asList(new ConceptEditorHintImpl("tabular", "Tabular notation", true, "Mining.editor.Tabular_hints.tabular"));
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Arrays.asList(new ConceptEditor[]{new Actuator_Editor(), new Actuator_tabular_Editor()});
      case 1:
        return Collections.<ConceptEditor>singletonList(new Actuator_Type_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new AdaptationRule_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Application_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Check_Point_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Check_Point_Event_Editor());
      case 6:
        return Arrays.asList(new ConceptEditor[]{new Cloud_Node_Editor(), new Cloud_Node_tabular_Editor()});
      case 7:
        return Collections.<ConceptEditor>singletonList(new Cluster_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Cluster_Reference_Editor());
      case 9:
        return Arrays.asList(new ConceptEditor[]{new Container_Editor(), new Container_tabular_Editor()});
      case 10:
        return Collections.<ConceptEditor>singletonList(new Container_Reference_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new Drift_Editor());
      case 12:
        return Arrays.asList(new ConceptEditor[]{new Edge_Node_Editor(), new Edge_Node_tabular_Editor()});
      case 13:
        return Collections.<ConceptEditor>singletonList(new Entry_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new Exp_ClusterLayer_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new Exp_Cont_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new Exp_LayerReg_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new Exp_Node_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new Exp_RegLayer_Editor());
      case 19:
        return Arrays.asList(new ConceptEditor[]{new Fog_Node_Editor(), new Fog_Node_tabular_Editor()});
      case 20:
        return Collections.<ConceptEditor>singletonList(new Internal_Editor());
      case 21:
        return Arrays.asList(new ConceptEditor[]{new IoT_System_Editor(), new IoT_System_tabular_Editor()});
      case 22:
        return Collections.<ConceptEditor>singletonList(new Mine_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new Node_Reference_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new Num_Value_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new Offloading_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new Operate_Actuator_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new Other_Region_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new Period_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new QoS_Event_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new Redeployment_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new Region_Reference_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new Room_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new Scaling_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new Seam_Editor());
      case 35:
        return Arrays.asList(new ConceptEditor[]{new Sensor_Editor(), new Sensor_tabular_Editor()});
      case 36:
        return Collections.<ConceptEditor>singletonList(new Sensor_Actuator_Type_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new Sensor_Event_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new Sensor_Events_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new Sensor_Type_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new Shaft_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new Slope_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new Threshold_Value_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new Topic_Editor());
      case 44:
        return Arrays.asList(new ConceptEditor[]{new Volume_Editor(), new Volume_tabular_Editor()});
      case 45:
        return Collections.<ConceptEditor>singletonList(new WorkerReference_Editor());
      case 46:
        return Collections.<ConceptEditor>singletonList(new Working_Face_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorHint> getHints() {
    return myHints;
  }

  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new Check_Point_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new Check_Point_Event_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new Cluster_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new Cluster_Reference_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new Container_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new Container_Reference_SubstituteMenu());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new Exp_ClusterLayer_SubstituteMenu());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new Exp_Cont_SubstituteMenu());
      case 8:
        return Collections.<SubstituteMenu>singletonList(new Exp_Node_SubstituteMenu());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new Exp_RegLayer_SubstituteMenu());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new IoT_Device_Reference_SubstituteMenu());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new Node_Reference_SubstituteMenu());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new QoS_Event_SubstituteMenu());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new Region_Reference_SubstituteMenu());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new Sensor_Event_SubstituteMenu());
      case 15:
        return Collections.<SubstituteMenu>singletonList(new Sensor_Events_SubstituteMenu());
      case 16:
        return Collections.<SubstituteMenu>singletonList(new WorkerReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6875cbL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859b6L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176aba26b788L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6857a6L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819d4L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859a8L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859a9L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x11dabaab0c63700aL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x330981c29fe0fb09L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x624a077add314f9fL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819d8L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859a6L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819d9L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5306924001b2832bL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x25ba6d72b2d8c740L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5a3631079e4b3368L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5306924001c7aec1L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176ababbb082L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859a7L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819daL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6857a2L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x555c752cc8abd2dfL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x11dabaab0c637009L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x1edc553a9815ad11L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x250b6e3f27339aeL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xde8316f4b5dd34dL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819dbL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x78a15643faf7e388L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176aba3d9f94L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x11dabaab0c6371b7L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x424863e2f3693460L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819dcL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x11dabaab0c637001L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819deL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6875c5L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859b0L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176abacfab9fL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x53069240016af7c7L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859b3L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819e0L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819e1L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x57afee207619014cL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x624a077add07cc36L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x1df32ba8689ddf66L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x6175b41c53adc1a5L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819e7L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5d25b8d4c26819d4L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5e29ada8f924f73dL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x23381bd32c6859a9L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x11dabaab0c63700aL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x330981c29fe0fb09L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x624a077add314f9fL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5306924001b2832bL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x25ba6d72b2d8c740L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x5306924001c7aec1L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176ababbb082L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x13065eed5f79955cL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x11dabaab0c637009L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176aba3d9f94L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x424863e2f3693460L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0xcbb176abacfab9fL), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x53069240016af7c7L), MetaIdFactory.conceptId(0x222ccd66f9d64014L, 0x8569354bddee8138L, 0x6175b41c53adc1a5L)).seal();
}
