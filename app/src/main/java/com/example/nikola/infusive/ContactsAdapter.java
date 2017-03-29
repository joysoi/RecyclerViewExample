package com.example.nikola.infusive;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nikola on 3/28/2017.
 */

class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;


        ViewHolder(View itemView) {

            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);

        }
    }

    private List<Contact> mContacts;
    private Context mContext;


    ContactsAdapter(Context context, List<Contact> contacts) {
        mContacts = contacts;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ContactsAdapter.ViewHolder viewHolder, int position) {
        Contact contact = mContacts.get(position);
        TextView textView = viewHolder.nameTextView;
        textView.setText(contact.getName());
    }


    @Override
    public int getItemCount() {
        return mContacts.size();
    }

}
