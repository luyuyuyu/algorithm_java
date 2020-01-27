package heap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class LayerTraversal {
	public List<List<Integer>> layerByLayer(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>> ();
		if (root == null) return result;
		Queue<TreeNode> queue = new ArrayDeque<TreeNode> ();
		queue.offer(root);
		while (!queue.isEmpty()) {
			List<Integer> curLayer = new ArrayList<Integer> ();
			int size = queue.size();
			for (int i = 0; i < size; ++i) {
				TreeNode cur = queue.poll();
				curLayer.add(cur.key);
				if (cur.left != null) {
					queue.offer(cur.left);
				}
				if (cur.right != null) {
					queue.offer(cur.right);
				}
			}
			result.add(curLayer);
		}
		return result;
	    // Write your solution here
	}
	
	public static void main(String[] args) {
		
	}
}