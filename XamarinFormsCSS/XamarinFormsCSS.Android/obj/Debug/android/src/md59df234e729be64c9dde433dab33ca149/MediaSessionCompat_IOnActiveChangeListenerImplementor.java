package md59df234e729be64c9dde433dab33ca149;


public class MediaSessionCompat_IOnActiveChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md59df234e729be64c9dde433dab33ca149.MediaSessionCompat_IOnActiveChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActiveChanged:()V:GetOnActiveChangedHandler:Android.Support.V4.Media.Session.MediaSessionCompat/IOnActiveChangeListenerInvoker, Xamarin.Android.Support.Media.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Media.Session.MediaSessionCompat+IOnActiveChangeListenerImplementor, Xamarin.Android.Support.Media.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaSessionCompat_IOnActiveChangeListenerImplementor.class, __md_methods);
	}


	public MediaSessionCompat_IOnActiveChangeListenerImplementor ()
	{
		super ();
		if (getClass () == MediaSessionCompat_IOnActiveChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Media.Session.MediaSessionCompat+IOnActiveChangeListenerImplementor, Xamarin.Android.Support.Media.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onActiveChanged ()
	{
		n_onActiveChanged ();
	}

	private native void n_onActiveChanged ();

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
