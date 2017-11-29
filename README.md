# BasePagerAdapter
BasePagerAdapter very easy to use 非常简单的BasePagerAdapter
## How to use
  1.download BasePagerAdapter.java and add it to your project
  2.Viewpager vp = (Viewpager) findViewById(R.id.vp);
    vp.setAdapter(new BasePagerAdapter<TestBean>(this, strings, R.layout.vp_page) {
            @Override
            public void bindView(View view, TestBean bean) {
                TextView tv = view.findViewById(R.id.tv);
                tv.setText("我的名字是: " + bean.name + "我的年龄是: " + bean.age);
            }
        });
