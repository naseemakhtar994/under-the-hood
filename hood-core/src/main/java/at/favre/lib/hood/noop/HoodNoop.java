package at.favre.lib.hood.noop;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;

import java.util.List;

import at.favre.lib.hood.interfaces.Config;
import at.favre.lib.hood.interfaces.HoodAPI;
import at.favre.lib.hood.interfaces.PageEntry;
import at.favre.lib.hood.interfaces.Pages;
import at.favre.lib.hood.interfaces.Section;
import at.favre.lib.hood.interfaces.actions.BoolConfigAction;
import at.favre.lib.hood.interfaces.actions.ButtonDefinition;
import at.favre.lib.hood.interfaces.actions.OnClickAction;
import at.favre.lib.hood.interfaces.actions.SingleSelectListConfigAction;
import at.favre.lib.hood.interfaces.values.DynamicValue;

/**
 * A no-op implementation
 */
public final class HoodNoop implements HoodAPI {
    private final Pages placeholderPages = new PagesNoop();
    private final PageEntry placeholderPageEntry = new PageEntryNoop();

    @NonNull
    @Override
    public Pages createPages(@NonNull Config config) {
        return placeholderPages;
    }

    @Override
    public PageEntry<?> createActionEntry(ButtonDefinition action) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createActionEntry(ButtonDefinition actionLeft, ButtonDefinition actionRight) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createHeaderEntry(CharSequence header) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createHeaderEntry(CharSequence header, boolean hideInLog) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createMessageEntry(CharSequence message) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createSwitchEntry(BoolConfigAction action) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createSpinnerEntry(SingleSelectListConfigAction action) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createPropertyEntry(CharSequence key, DynamicValue<String> value, OnClickAction action, boolean multiLine) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createPropertyEntry(CharSequence key, DynamicValue<String> value, boolean multiLine) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createPropertyEntry(CharSequence key, DynamicValue<String> value) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createPropertyEntry(CharSequence key, String value, OnClickAction action, boolean multiLine) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createPropertyEntry(CharSequence key, String value, boolean multiLine) {
        return placeholderPageEntry;
    }

    @Override
    public PageEntry<?> createPropertyEntry(CharSequence key, String value) {
        return placeholderPageEntry;
    }

    public static final class HoodExtensionNoop implements HoodAPI.Extension {
        private final CharSequence placeholderCharSequence = String.valueOf("");
        private final OnClickAction placeholderOnClickAction = new OnClickActionNoop();
        private final Section.ModifiableHeaderSection placeholderSection = new SectionNoop();

        @Override
        public Section.ModifiableHeaderSection createSection(String header) {
            return placeholderSection;
        }

        @Override
        public Section.ModifiableHeaderSection createSection(String header, List<PageEntry<?>> entries) {
            return placeholderSection;
        }

        @Override
        public OnClickAction createOnClickActionAskPermission(String perm, Activity activity) {
            return placeholderOnClickAction;
        }

        @Override
        public OnClickAction createOnClickActionStartIntent(Intent intent) {
            return placeholderOnClickAction;
        }

        @Override
        public OnClickAction createOnClickActionToast() {
            return placeholderOnClickAction;
        }

        @Override
        public CharSequence createFullLabel(CharSequence shortLabel, CharSequence fullLabel) {
            return placeholderCharSequence;
        }
    }
}