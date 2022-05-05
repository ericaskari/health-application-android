// Generated by view binder compiler. Do not edit!
package com.ericaskari.healthapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PainHistoryListItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView createdAtValue;

  @NonNull
  public final TextView descriptionValue;

  @NonNull
  public final TextView howMedicineAffectedText;

  @NonNull
  public final TextView howMedicineAffectedValue;

  @NonNull
  public final TextView medicinesTakenText;

  @NonNull
  public final TextView medicinesTakenValue;

  @NonNull
  public final TextView painStrengthValue;

  @NonNull
  public final TextView titleValue;

  private PainHistoryListItemBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull TextView createdAtValue, @NonNull TextView descriptionValue,
      @NonNull TextView howMedicineAffectedText, @NonNull TextView howMedicineAffectedValue,
      @NonNull TextView medicinesTakenText, @NonNull TextView medicinesTakenValue,
      @NonNull TextView painStrengthValue, @NonNull TextView titleValue) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.createdAtValue = createdAtValue;
    this.descriptionValue = descriptionValue;
    this.howMedicineAffectedText = howMedicineAffectedText;
    this.howMedicineAffectedValue = howMedicineAffectedValue;
    this.medicinesTakenText = medicinesTakenText;
    this.medicinesTakenValue = medicinesTakenValue;
    this.painStrengthValue = painStrengthValue;
    this.titleValue = titleValue;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PainHistoryListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PainHistoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pain_history_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PainHistoryListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.created_at_value;
      TextView createdAtValue = ViewBindings.findChildViewById(rootView, id);
      if (createdAtValue == null) {
        break missingId;
      }

      id = R.id.description_value;
      TextView descriptionValue = ViewBindings.findChildViewById(rootView, id);
      if (descriptionValue == null) {
        break missingId;
      }

      id = R.id.how_medicine_affected_text;
      TextView howMedicineAffectedText = ViewBindings.findChildViewById(rootView, id);
      if (howMedicineAffectedText == null) {
        break missingId;
      }

      id = R.id.how_medicine_affected_value;
      TextView howMedicineAffectedValue = ViewBindings.findChildViewById(rootView, id);
      if (howMedicineAffectedValue == null) {
        break missingId;
      }

      id = R.id.medicines_taken_text;
      TextView medicinesTakenText = ViewBindings.findChildViewById(rootView, id);
      if (medicinesTakenText == null) {
        break missingId;
      }

      id = R.id.medicines_taken_value;
      TextView medicinesTakenValue = ViewBindings.findChildViewById(rootView, id);
      if (medicinesTakenValue == null) {
        break missingId;
      }

      id = R.id.pain_strength_value;
      TextView painStrengthValue = ViewBindings.findChildViewById(rootView, id);
      if (painStrengthValue == null) {
        break missingId;
      }

      id = R.id.title_value;
      TextView titleValue = ViewBindings.findChildViewById(rootView, id);
      if (titleValue == null) {
        break missingId;
      }

      return new PainHistoryListItemBinding((CardView) rootView, cardView, createdAtValue,
          descriptionValue, howMedicineAffectedText, howMedicineAffectedValue, medicinesTakenText,
          medicinesTakenValue, painStrengthValue, titleValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
