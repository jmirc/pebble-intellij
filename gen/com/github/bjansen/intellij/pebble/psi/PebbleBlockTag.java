// This is a generated file. Not intended for manual editing.
package com.github.bjansen.intellij.pebble.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PebbleBlockTag extends PebbleTag {

  @NotNull
  List<PebbleCommentDirective> getCommentDirectiveList();

  @NotNull
  PebbleEndblockTag getEndblockTag();

  @Nullable
  PebbleIdentifier getIdentifier();

  @NotNull
  List<PebblePrintDirective> getPrintDirectiveList();

  @Nullable
  PebbleStringLiteral getStringLiteral();

  @NotNull
  List<PebbleTagDirective> getTagDirectiveList();

}
