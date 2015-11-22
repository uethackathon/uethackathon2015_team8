package com.j4f.interfaces;


import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.j4f.cores.CoreInterface;

public interface ImageRequestListener extends CoreInterface {
    public void onBefore();

    public void onResponse(ImageContainer paramImageContainer, boolean paramBoolean);

    public void onErrorResponse(VolleyError error);
}
