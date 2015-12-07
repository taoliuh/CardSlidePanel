package com.stone.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * 卡片View项
 * @author xmuSistone
 */
public class CardItemView extends FrameLayout {

    private SimpleDraweeView imageView;
    private View shadeView;

    public CardItemView(Context context) {
        this(context, null);
    }

    public CardItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        inflate(context, R.layout.card_item, this);
        imageView = (SimpleDraweeView) findViewById(R.id.card_image_view);
        shadeView = findViewById(R.id.shade);
    }

    public void fillData(CardDataItem itemData) {
        imageView.setImageURI(Uri.parse(itemData.imagePath));
    }

    public void setShadeLayer(int shaderLayer) {
        shadeView.setBackgroundResource(shaderLayer);
    }

}
