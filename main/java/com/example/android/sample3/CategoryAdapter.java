package com.example.android.sample3;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/*
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Word} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BusinessDevelopmentFragment();
        } else if (position == 1) {
            return new ContentWriterFragment();
        } else if (position == 2) {
            return new AppDevelopmentFragment();
        } else if (position == 3) {
            return new WebDevelopmentFragment();
        } else if (position == 4) {
            return new GraphicDesignersFragment();
        } else {
            return new SocialMediaManagersFragment();
        }
    }


    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.business_developers);
        } else if (position == 1) {
            return mContext.getString(R.string.content_writers);
        } else if (position == 2) {
            return mContext.getString(R.string.app_development);
        } else if (position == 3) {
            return mContext.getString(R.string.web_development);
        } else if (position == 4) {
            return mContext.getString(R.string.graphic_designers);
        } else {
            return mContext.getString(R.string.social_media_managers);
        }
    }
}
