package HealthcareLanguage.feedback;

/*Generated by MPS */

import jetbrains.mps.core.aspects.feedback.api.BaseFeedbackDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.feedback.api.FeedbackProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingPropertyConstraintContext;
import jetbrains.mps.core.aspects.feedback.messages.BaseMessageProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingPropertyConstraintProblemId;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.feedback.messages.MessageProvider;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Stream;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Appoinment_FeedbackFeedback extends BaseFeedbackDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a023fL, "HealthcareLanguage.structure.Appoinment");

  private static final FeedbackProvider<FailingPropertyConstraintContext> MSGPROVIDER_WhenPropertyConstraintFails_973h8_a = new BaseMessageProvider<FailingPropertyConstraintContext>(new FailingPropertyConstraintProblemId(PROPS.end$mLiZ)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(FailingPropertyConstraintContext context) {
      return new MessageProvider.StringMsg("\"Please use a DD/MM/YYYY date format and make sure the end date is not before start date.\"");
    }
  };
  private static final FeedbackProvider<FailingPropertyConstraintContext> MSGPROVIDER_WhenPropertyConstraintFails_973h8_b = new BaseMessageProvider<FailingPropertyConstraintContext>(new FailingPropertyConstraintProblemId(PROPS.start$mL3Y)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(FailingPropertyConstraintContext context) {
      return new MessageProvider.StringMsg("\"Please use a DD/MM/YYYY date format." + "\"" + "");
    }
  };

  private static final List<FeedbackProvider> PROVIDERS = Collections.unmodifiableList(Arrays.<FeedbackProvider>asList(MSGPROVIDER_WhenPropertyConstraintFails_973h8_a, MSGPROVIDER_WhenPropertyConstraintFails_973h8_b));

  public Appoinment_FeedbackFeedback() {
    super(CONCEPT);
  }

  @NotNull
  @Override
  public Stream<FeedbackProvider> getDeclaredProviders() {
    return PROVIDERS.stream();
  }

  private static final class PROPS {
    /*package*/ static final SProperty end$mLiZ = MetaAdapterFactory.getProperty(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a023fL, 0x2f557f2e960a0241L, "end");
    /*package*/ static final SProperty start$mL3Y = MetaAdapterFactory.getProperty(0x7f0568a28c1a4091L, 0xa87e390be85922c7L, 0x2f557f2e960a023fL, 0x2f557f2e960a0240L, "start");
  }
}
