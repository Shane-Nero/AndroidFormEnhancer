package com.androidformenhancer.test;

import android.test.ActivityInstrumentationTestCase2;

public class SampleFragmentActivityTest extends ActivityInstrumentationTestCase2<SampleFragmentActivity> {

    private SampleFragmentActivity activity;

    public SampleFragmentActivityTest() {
        super(SampleFragmentActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    public void testSubmit() throws Throwable {
        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.findViewById(R.id.btn_submit).performClick();
            }
        });
        getInstrumentation().waitForIdleSync();
    }

}
