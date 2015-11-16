package il.ac.shenkar.grisha.todolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends BaseAdapter{
    private Context context;
    private List<String> items;

    public MyListAdapter(Context context, List<String> items) {
        this.context = context;
        this.items = items;
    }

    static class ViewHolder {
        TextView textView;
        Button button;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        if (this.items != null && items.size() > position)
            return this.items.get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.list_item, null);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.list_item_text);
            convertView.setTag(holder);
        }
        else {
        holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(items.get(position));
    return convertView;
    }
}
