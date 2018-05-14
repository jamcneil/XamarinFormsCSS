package md5533bfcf241f238ea99ac1210cd2d56e8;


public class NestedScrollView_IOnScrollChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5533bfcf241f238ea99ac1210cd2d56e8.NestedScrollView_IOnScrollChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrollChange:(Landroid/support/v4/widget/NestedScrollView;IIII)V:GetOnScrollChange_Landroid_support_v4_widget_NestedScrollView_IIIIHandler:Android.Support.V4.Widget.NestedScrollView/IOnScrollChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.NestedScrollView+IOnScrollChangeListenerImplementor, Xamarin.Android.Support.Core.UI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", NestedScrollView_IOnScrollChangeListenerImplementor.class, __md_methods);
	}


	public NestedScrollView_IOnScrollChangeListenerImplementor ()
	{
		super ();
		if (getClass () == NestedScrollView_IOnScrollChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.NestedScrollView+IOnScrollChangeListenerImplementor, Xamarin.Android.Support.Core.UI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onScrollChange (android.support.v4.widget.NestedScrollView p0, int p1, int p2, int p3, int p4)
	{
		n_onScrollChange (p0, p1, p2, p3, p4);
	}

	private native void n_onScrollChange (android.support.v4.widget.NestedScrollView p0, int p1, int p2, int p3, int p4);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
