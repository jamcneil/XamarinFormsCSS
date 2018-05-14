package md535bdad051ab937b588770c20eabc9ab6;


public class ContentFrameLayout_IOnAttachListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md535bdad051ab937b588770c20eabc9ab6.ContentFrameLayout_IOnAttachListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedFromWindow:()V:GetOnAttachedFromWindowHandler:Android.Support.V7.Widget.ContentFrameLayout/IOnAttachListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler:Android.Support.V7.Widget.ContentFrameLayout/IOnAttachListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.ContentFrameLayout+IOnAttachListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ContentFrameLayout_IOnAttachListenerImplementor.class, __md_methods);
	}


	public ContentFrameLayout_IOnAttachListenerImplementor ()
	{
		super ();
		if (getClass () == ContentFrameLayout_IOnAttachListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.ContentFrameLayout+IOnAttachListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAttachedFromWindow ()
	{
		n_onAttachedFromWindow ();
	}

	private native void n_onAttachedFromWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

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
