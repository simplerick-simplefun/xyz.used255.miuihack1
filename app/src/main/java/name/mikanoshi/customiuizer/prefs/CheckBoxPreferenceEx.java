package name.mikanoshi.customiuizer.prefs;

import android.content.Context;
import android.content.res.Resources;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import name.mikanoshi.customiuizer.R;

public class CheckBoxPreferenceEx extends CheckBoxPreference {

	public CheckBoxPreferenceEx(Context context) {
		super(context);
	}

	public CheckBoxPreferenceEx(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CheckBoxPreferenceEx(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected View onCreateView(ViewGroup parent) {
		View view = super.onCreateView(parent);
		Resources res = getContext().getResources();
		((TextView)view.findViewById(android.R.id.title)).setMaxLines(3);
		((TextView)view.findViewById(android.R.id.summary)).setTextColor(res.getColor(res.getIdentifier("preference_secondary_text_light", "color", "miui"), getContext().getTheme()));
		return view;
	}
}