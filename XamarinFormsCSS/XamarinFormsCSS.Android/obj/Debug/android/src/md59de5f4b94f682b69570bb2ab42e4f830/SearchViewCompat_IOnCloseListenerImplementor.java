package md59de5f4b94f682b69570bb2ab42e4f830;


public class SearchViewCompat_IOnCloseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md59de5f4b94f682b69570bb2ab42e4f830.SearchViewCompat_IOnCloseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClose:()Z:GetOnCloseHandler:Android.Support.V4.Widget.SearchViewCompat/IOnCloseListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SearchViewCompat+IOnCloseListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SearchViewCompat_IOnCloseListenerImplementor.class, __md_methods);
	}


	public SearchViewCompat_IOnCloseListenerImplementor ()
	{
		super ();
		if (getClass () == SearchViewCompat_IOnCloseListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SearchViewCompat+IOnCloseListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onClose ()
	{
		return n_onClose ();
	}

	private native boolean n_onClose ();

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
