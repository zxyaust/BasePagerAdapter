# BasePagerAdapter
BasePagerAdapter very easy to use 非常简单的BasePagerAdapter

## How to use

  1.download BasePagerAdapter.java and add it to your project
  
  下载BasePagerAdapter.java文件,添加到你自己的project中
  
  2.
```
Viewpager vp = (Viewpager) findViewById(R.id.vp); 
      List<String> list = new ArrayList<>();
      
      list.add("http://xxx.xxx.xxx");
      
      list.add("http://xxx.xxx.xxx");
      
      list.add("http://xxx.xxx.xxx");
      
        BasePagerAdapter<String> adapter = new BasePagerAdapter<String>(list) {
                @Override
                public View bindView(String bean) {
                //初始化你自己的view,并与数据绑定
                //init you view and bind with data
                    ImageView imageView = new ImageView(getBaseContext());
                    ViewPager.LayoutParams params = new ViewPager.LayoutParams();
                    params.height = ViewPager.LayoutParams.MATCH_PARENT;
                    params.width = ViewPager.LayoutParams.MATCH_PARENT;
                    imageView.setLayoutParams(params);
                    GlideUtil.loadImg(getBaseContext(), bean.toString(), imageView);
                    return imageView;
                }
            };
            //you can  set click event as well 你也可以设置点击事件
            
           adapter.setOnItemClickListener(new BasePagerAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View v, int position) {
                    finish();
                }
            });
            vp.setAdapter(adapter);
```
