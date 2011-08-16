#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test;

import ${package}.${appName}Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class ${appName}Test extends ActivityInstrumentationTestCase2<${appName}Activity> {
    private ${appName}Activity mActivity;  // the activity under test
    private TextView mView;          // the activity's TextView (the only view)
    private String resourceString;

    public ${appName}Test() {
      super("${package}", ${appName}Activity.class);
    }
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById(${package}.R.id.textview);
        resourceString = mActivity.getString(${package}.R.string.msg);
    }
    
    public void testPreconditions() {
      assertNotNull(mView);
    }
    
    public void testText() {
      assertEquals(resourceString,(String)mView.getText());
    }
}
