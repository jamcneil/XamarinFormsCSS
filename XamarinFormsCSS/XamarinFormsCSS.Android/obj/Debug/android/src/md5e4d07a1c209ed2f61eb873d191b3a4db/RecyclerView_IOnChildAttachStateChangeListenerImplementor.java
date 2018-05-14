package md5e4d07a1c209ed2f61eb873d191b3a4db;


public class RecyclerView_IOnChildAttachStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5e4d07a1c209ed2f61eb873d191b3a4db.RecyclerView_IOnChildAttachStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChildViewAttachedToWindow:(Landroid/view/View;)V:GetOnChildViewAttachedToWindow_Landroid_view_View_Handler:Android.Support.V7.Widget.RecyclerView/IOnChildAttachStateChangeListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"n_onChildViewDetachedFromWindow:(Landroid/view/View;)V:GetOnChildViewDetachedFromWindow_Landroid_view_View_Handler:Android.Support.V7.Widget.RecyclerView/IOnChildAttachStateChangeListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.RecyclerView+IOnChildAttachStateChangeListenerImplementor, Xamarin.Android.Support.v7.RecyclerView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RecyclerView_IOnChildAttachStateChangeListenerImplementor.class, __md_methods);
	}


	public RecyclerView_IOnChildAttachStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_IOnChildAttachStateChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.RecyclerView+IOnChildAttachStateChangeListenerImplementor, Xamarin.Android.Support.v7.RecyclerView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onChildViewAttachedToWindow (android.view.View p0)
	{
		n_onChildViewAttachedToWindow (p0);
	}

	private native void n_onChildViewAttachedToWindow (android.view.View p0);


	public void onChildViewDetachedFromWindow (android.view.View p0)
	{
		n_onChildViewDetachedFromWindow (p0);
	}

	private native void n_onChildViewDetachedFromWindow (android.view.View p0);

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
