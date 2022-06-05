package org.betterx.bclib.api.features;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

import org.betterx.bclib.api.features.config.SequenceFeatureConfig;

public class SequenceFeature extends Feature<SequenceFeatureConfig> {
    public SequenceFeature() {
        super(SequenceFeatureConfig.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<SequenceFeatureConfig> featurePlaceContext) {
        return featurePlaceContext.config().placeAll(featurePlaceContext);
    }
}
