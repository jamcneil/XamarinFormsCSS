package md535bdad051ab937b588770c20eabc9ab6;


public class IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md535bdad051ab937b588770c20eabc9ab6.IFitWindowsViewGroupOnFitSystemWindowsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFitSystemWindows:(Landroid/graphics/Rect;)V:GetOnFitSystemWindows_Landroid_graphics_Rect_Handler:Android.Support.V7.Widget.IFitWindowsViewGroupOnFitSystemWindowsListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor.class, __md_methods);
	}


	public IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor ()
	{
		super ();
		if (getClass () == IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.IFitWindowsViewGroupOnFitSystemWindowsListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onFitSystemWindows (android.graphics.Rect p0)
	{
		n_onFitSystemWindows (p0);
	}

	private native void n_onFitSystemWindows (android.graphics.Rect p0);

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