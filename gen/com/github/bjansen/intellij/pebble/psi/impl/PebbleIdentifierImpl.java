// This is a generated file. Not intended for manual editing.
package com.github.bjansen.intellij.pebble.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.bjansen.intellij.pebble.psi.PebbleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.bjansen.intellij.pebble.psi.*;

public class PebbleIdentifierImpl extends ASTWrapperPsiElement implements PebbleIdentifier {

  public PebbleIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PebbleVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PebbleVisitor) accept((PebbleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdName() {
    return findNotNullChildByType(ID_NAME);
  }

}
