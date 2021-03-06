/*************************************************************************
* Copyright (c) 2015 Lemberg Solutions
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
**************************************************************************/

package com.ls.widgets.map.model;

import android.graphics.Rect;

public class MapTouchable
{
	private Object id; //Used to identify the touchable
	private Rect rect; //Used to define the position and a size of the touchable
	private MapObject drawableRef;
	
	public MapTouchable(Object id, MapObject drawable, Rect rect)
	{
		this.id = id;
		this.rect = rect;
		drawableRef = drawable;
	}
	
	public Object getId()
	{
		return id;
	}
	
	public boolean isTouched(int x, int y)
	{
		return rect.contains(x, y);
	}
	
	public boolean isTouched(Rect touchRect)
	{
		return Rect.intersects(rect, touchRect);
	}
	
	public MapObject getDrawable()
	{
		return drawableRef;
	}
	
}