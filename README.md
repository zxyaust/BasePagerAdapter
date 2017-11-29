# BasePagerAdapter
BasePagerAdapter very easy to use 非常简单的BasePagerAdapter
## How to use
  1.download BasePagerAdapter.java and add it to your project
  2.Viewpager vp = (Viewpager) findViewById(R.id.vp);
      List<String> list = new ArrayList<>();
      list.add("http://xxx.xxx.xxx");
      list.add("http://xxx.xxx.xxx");
      list.add("http://xxx.xxx.xxx");
        BasePagerAdapter<String> adapter = new BasePagerAdapter<String>(list) {
                @Override
                public View bindView(String bean) {
                    ImageView imageView = new ImageView(getBaseContext());
                    ViewPager.LayoutParams params = new ViewPager.LayoutParams();
                    params.height = ViewPager.LayoutParams.MATCH_PARENT;
                    params.width = ViewPager.LayoutParams.MATCH_PARENT;
                    imageView.setLayoutParams(params);
                    GlideUtil.loadImg(getBaseContext(), bean.toString(), imageView);
                    return imageView;
                }
            };
            adapter.setOnItemClickListener(new BasePagerAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View v, int position) {
                    finish();
                }
            });
            vp.setAdapter(adapter);
