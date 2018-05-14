package md535bdad051ab937b588770c20eabc9ab6;


public class ShareActionProvider_IOnShareTargetSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md535bdad051ab937b588770c20eabc9ab6.ShareActionProvider_IOnShareTargetSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShareTargetSelected:(Landroid/support/v7/widget/ShareActionProvider;Landroid/content/Intent;)Z:GetOnShareTargetSelected_Landroid_support_v7_widget_ShareActionProvider_Landroid_content_Intent_Handler:Android.Support.V7.Widget.ShareActionProvider/IOnShareTargetSelectedListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.ShareActionProvider+IOnShareTargetSelectedListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ShareActionProvider_IOnShareTargetSelectedListenerImplementor.class, __md_methods);
	}


	public ShareActionProvider_IOnShareTargetSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == ShareActionProvider_IOnShareTargetSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.ShareActionProvider+IOnShareTargetSelectedListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onShareTargetSelected (android.support.v7.widget.ShareActionProvider p0, android.content.Intent p1)
	{
		return n_onShareTargetSelected (p0, p1);
	}

	private native boolean n_onShareTargetSelected (android.support.v7.widget.ShareActionProvider p0, android.content.Intent p1);

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
