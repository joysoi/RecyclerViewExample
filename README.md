# RecyclerViewExample
Recycler View example backed by data model with RecyclerViewAdapter 

## RecyclerView steps:

Add library to the gradle build file

```
dependencies {
    ...
    compile 'com.android.support:recyclerview-v7:25.2.0'
}
```

* Adapter: A subclass of RecyclerView.Adapter responsible for providing views that represent items in a data set.
* Position: The position of a data item within an Adapter.
* Index: The index of an attached child view as used in a call to getChildAt(int). Contrast with Position.
* Binding: The process of preparing a child view to display data corresponding to a position within the adapter.
* Recycle (view): A view previously used to display data for a specific adapter position may be placed in a cache for later reuse to display the same type of data again later. This can drastically improve performance by skipping initial layout inflation or construction.
* Scrap (view): A child view that has entered into a temporarily detached state during layout. Scrap views may be reused without becoming fully detached from the parent RecyclerView, either unmodified if no rebinding is required or modified by the adapter if the view was considered dirty.
* Dirty (view): A child view that must be rebound by the adapter before being displayed.
