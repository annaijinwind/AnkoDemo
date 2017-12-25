package com.fjq.anko.ui

import android.view.Gravity
import android.widget.LinearLayout
import com.fjq.anko.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by fengj on 2017/12/24.
 */
class MainUi<T>:AnkoComponent<T>{
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            backgroundResource = R.drawable.bg_activity_startup
            fitsSystemWindows = true

            linearLayout {
                id = Ids.parent
                orientation = LinearLayout.VERTICAL
                space().lparams(width = matchParent, height = dip(0)) {
                    weight = 188f
                }
                linearLayout {
                    gravity = Gravity.CENTER_HORIZONTAL
                    id = Ids.scanveryfy_on_click
                    orientation = LinearLayout.VERTICAL
                    relativeLayout {
                        gravity = Gravity.CENTER
                        linearLayout {
                            gravity = Gravity.CENTER
                            view {
                                backgroundResource = R.color.orange_d6a41d
                            }.lparams(width = dip(0), height = dip(1)) {
                                weight = 1f
                            }
                            imageView {
                                imageResource = R.drawable.bg_scan_normal
                            }.lparams(width = dip(260), height = dip(243))
                            view {
                                backgroundResource = R.color.orange_d6a41d
                            }.lparams(width = dip(0), height = dip(1)) {
                                weight = 1f
                            }
                        }.lparams(width = matchParent, height = wrapContent)
                        imageView {
                            id = Ids.scanveryfy
                            imageResource=R.drawable.scan_btn_normal
                        }.lparams(width = dip(115), height = dip(115)) {
                            centerInParent()
                        }
                    }.lparams(width = matchParent, height = wrapContent)
                    textView(R.string.btn_star_scan) {
                        id = Ids.txtScanGuideStart
                        textColor = resources.getColor(R.color.white_fff)
                        textSize = 20f
                    }.lparams(width = wrapContent, height = wrapContent) {
                        topMargin = dip(20)
                    }
                }.lparams(width = matchParent, height = wrapContent)
                space().lparams(width = matchParent, height = dip(0)) {
                    weight = 146f
                }
                linearLayout {
                    gravity = Gravity.CENTER

                    linearLayout {
                        gravity = Gravity.CENTER_HORIZONTAL
                        id = Ids.allbrands_on_click
                        orientation = LinearLayout.VERTICAL

                        imageView {
                            id = Ids.allbrands
                            imageResource = R.drawable.all_brand_normal
                        }.lparams(width = dip(30), height = dip(30))
                        textView(R.string.btn_all_brands) {
                            id = Ids.txtAllBrand
                            textColor = resources.getColor(R.color.white_fff)
                            textSize = 14f
                        }.lparams(width = wrapContent, height = wrapContent) {
                            topMargin = dip(15)
                        }
                    }.lparams(width = dip(0), height = wrapContent) {
                        weight = 1f
                    }
                    linearLayout {
                        gravity = Gravity.CENTER_HORIZONTAL
                        id = Ids.nearactivity_on_click
                        orientation = LinearLayout.VERTICAL

                        imageView {
                            id = Ids.nearactivity
                            imageResource = R.drawable.btn_local_stor_normal
                        }.lparams(width = dip(30), height = dip(30))
                        textView(R.string.preferential) {
                            id = Ids.txtStore
                            textColor = resources.getColor(R.color.white_fff)
                            textSize = 14f
                        }.lparams(width = wrapContent, height = wrapContent) {
                            topMargin = dip(15)
                        }
                    }.lparams(width = dip(0), height = wrapContent) {
                        weight = 1f
                    }
                    linearLayout {
                        gravity = Gravity.CENTER_HORIZONTAL
                        id = Ids.personal_activity_on_click
                        orientation = LinearLayout.VERTICAL

                        imageView {
                            id = Ids.personal_activity
                            imageResource = R.drawable.personal_normal
                        }.lparams(width = dip(30), height = dip(30))
                        textView(R.string.user_center) {
                            id = Ids.txtUser
                            textColor = resources.getColor(R.color.white_fff)
                            textSize = 14f
                        }.lparams(width = wrapContent, height = wrapContent) {
                            topMargin = dip(15)
                        }
                    }.lparams(width = dip(0), height = wrapContent) {
                        weight = 1f
                    }
                }.lparams(width = matchParent, height = wrapContent)
                space().lparams(width = matchParent, height = dip(0)) {
                    weight = 33f
                }
            }.lparams(width = matchParent, height = matchParent)
        }
    }
    private object Ids {
        val allbrands = 1
        val allbrands_on_click = 2
        val nearactivity = 3
        val nearactivity_on_click = 4
        val parent = 5
        val personal_activity = 6
        val personal_activity_on_click = 7
        val scanveryfy = 8
        val scanveryfy_on_click = 9
        val txtAllBrand = 10
        val txtScanGuideStart = 11
        val txtStore = 12
        val txtUser = 13
    }
}