package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/view/DragStartHelper.class */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final View.OnLongClickListener mLongClickListener = new View.OnLongClickListener() { // from class: androidx.core.view.b
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return DragStartHelper.this.onLongClick(view);
        }
    };
    private final View.OnTouchListener mTouchListener = new View.OnTouchListener() { // from class: androidx.core.view.c
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return DragStartHelper.this.onTouch(view, motionEvent);
        }
    };
    private final View mView;

    /* loaded from: ItsOnFire.jar:androidx/core/view/DragStartHelper$OnDragStartListener.class */
    public interface OnDragStartListener {
        boolean onDragStart(@NonNull View view, @NonNull DragStartHelper dragStartHelper);
    }

    public DragStartHelper(@NonNull View view, @NonNull OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    public void getTouchPosition(@NonNull Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }

    public boolean onLongClick(@NonNull View view) {
        return this.mListener.onDragStart(view, this);
    }

    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = x;
            this.mLastTouchY = y;
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                if (!MotionEventCompat.isFromSource(motionEvent, 8194) || (motionEvent.getButtonState() & 1) == 0 || this.mDragging) {
                    return false;
                }
                if (this.mLastTouchX == x && this.mLastTouchY == y) {
                    return false;
                }
                this.mLastTouchX = x;
                this.mLastTouchY = y;
                boolean onDragStart = this.mListener.onDragStart(view, this);
                this.mDragging = onDragStart;
                return onDragStart;
            } else if (action != 3) {
                return false;
            }
        }
        this.mDragging = false;
        return false;
    }
}
