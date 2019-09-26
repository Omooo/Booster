package top.omooo.booster.transform;

import org.jetbrains.annotations.NotNull;

public interface TransformListener {

    default void onPreTransform(@NotNull final TransformContext context) {

    }

    default void onPostTransform(@NotNull final TransformContext context) {

    }
}
