package md5e4d07a1c209ed2f61eb873d191b3a4db;


public class RecyclerView_IRecyclerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5e4d07a1c209ed2f61eb873d191b3a4db.RecyclerView_IRecyclerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onViewRecycled:(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V:GetOnViewRecycled_Landroid_support_v7_widget_RecyclerView_ViewHolder_Handler:Android.Support.V7.Widget.RecyclerView/IRecyclerListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.RecyclerView+IRecyclerListenerImplementor, Xamarin.Android.Support.v7.RecyclerView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RecyclerView_IRecyclerListenerImplementor.class, __md_methods);
	}


	public RecyclerView_IRecyclerListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_IRecyclerListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.RecyclerView+IRecyclerListenerImplementor, Xamarin.Android.Support.v7.RecyclerView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onViewRecycled (android.support.v7.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewRecycled (p0);
	}

	private native void n_onViewRecycled (android.support.v7.widget.RecyclerView.ViewHolder p0);

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
