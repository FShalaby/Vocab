// Generated by view binder compiler. Do not edit!
package com.javageeks.vocab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.javageeks.vocab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySecondScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageButton imageButton3;

  @NonNull
  public final ImageButton imageButton4;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  private ActivitySecondScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2,
      @NonNull ImageButton imageButton3, @NonNull ImageButton imageButton4,
      @NonNull TextView textView2, @NonNull TextView textView4, @NonNull TextView textView6,
      @NonNull TextView textView8) {
    this.rootView = rootView;
    this.imageButton = imageButton;
    this.imageButton2 = imageButton2;
    this.imageButton3 = imageButton3;
    this.imageButton4 = imageButton4;
    this.textView2 = textView2;
    this.textView4 = textView4;
    this.textView6 = textView6;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySecondScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySecondScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_second_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySecondScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageButton3;
      ImageButton imageButton3 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton3 == null) {
        break missingId;
      }

      id = R.id.imageButton4;
      ImageButton imageButton4 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton4 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivitySecondScreenBinding((ConstraintLayout) rootView, imageButton, imageButton2,
          imageButton3, imageButton4, textView2, textView4, textView6, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}