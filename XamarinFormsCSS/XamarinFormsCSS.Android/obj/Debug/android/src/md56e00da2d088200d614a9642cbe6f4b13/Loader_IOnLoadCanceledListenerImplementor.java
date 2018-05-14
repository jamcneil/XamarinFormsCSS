package md56e00da2d088200d614a9642cbe6f4b13;


public class Loader_IOnLoadCanceledListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md56e00da2d088200d614a9642cbe6f4b13.Loader_IOnLoadCanceledListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadCanceled:(Landroid/support/v4/content/Loader;)V:GetOnLoadCanceled_Landroid_support_v4_content_Loader_Handler:Android.Support.V4.Content.Loader/IOnLoadCanceledListenerInvoker, Xamarin.Android.Support.Core.Utils\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Content.Loader+IOnLoadCanceledListenerImplementor, Xamarin.Android.Support.Core.Utils, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Loader_IOnLoadCanceledListenerImplementor.class, __md_methods);
	}


	public Loader_IOnLoadCanceledListenerImplementor ()
	{
		super ();
		if (getClass () == Loader_IOnLoadCanceledListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Content.Loader+IOnLoadCanceledListenerImplementor, Xamarin.Android.Support.Core.Utils, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onLoadCanceled (android.support.v4.content.Loader p0)
	{
		n_onLoadCanceled (p0);
	}

	private native void n_onLoadCanceled (android.support.v4.content.Loader p0);

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
