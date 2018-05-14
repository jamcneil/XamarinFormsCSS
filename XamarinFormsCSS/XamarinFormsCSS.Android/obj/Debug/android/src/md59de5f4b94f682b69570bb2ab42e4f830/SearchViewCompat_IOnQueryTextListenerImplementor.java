package md59de5f4b94f682b69570bb2ab42e4f830;


public class SearchViewCompat_IOnQueryTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md59de5f4b94f682b69570bb2ab42e4f830.SearchViewCompat_IOnQueryTextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onQueryTextChange:(Ljava/lang/String;)Z:GetOnQueryTextChange_Ljava_lang_String_Handler:Android.Support.V4.Widget.SearchViewCompat/IOnQueryTextListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"n_onQueryTextSubmit:(Ljava/lang/String;)Z:GetOnQueryTextSubmit_Ljava_lang_String_Handler:Android.Support.V4.Widget.SearchViewCompat/IOnQueryTextListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SearchViewCompat+IOnQueryTextListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SearchViewCompat_IOnQueryTextListenerImplementor.class, __md_methods);
	}


	public SearchViewCompat_IOnQueryTextListenerImplementor ()
	{
		super ();
		if (getClass () == SearchViewCompat_IOnQueryTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SearchViewCompat+IOnQueryTextListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onQueryTextChange (java.lang.String p0)
	{
		return n_onQueryTextChange (p0);
	}

	private native boolean n_onQueryTextChange (java.lang.String p0);


	public boolean onQueryTextSubmit (java.lang.String p0)
	{
		return n_onQueryTextSubmit (p0);
	}

	private native boolean n_onQueryTextSubmit (java.lang.String p0);

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
