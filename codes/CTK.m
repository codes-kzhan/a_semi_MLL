function [F, Time] = CTK(W, Y, eta)
% Commute-time Kernel
%
% Input: 
%     W: weight matrix of the graph of size n-by-n
%     Y: label matrix of size n-by-k, where k is the number of classes
%     eta: parameter of controlling teleporting
% Output: 
%     F: affinity matrix of size n-by-k
%     Time: CPU time
%
% Reference:
%     F. Fouss, K. Fraancoisse, L. Yen, A. Pirotte, and M. Saerens. An
%     experimental investigation of kernels on graphs for collaborative
%     recommendation and semisupervised classification. Neural Networks,
%     2012.
%
% Written by Xiaowei Zhang 

if nargin < 3
    eta = 0.01;
end

t = tic;

% construct transision probability matrix
n = size(W, 1);
degree = sum(W,2); % outdegree
P = W;
ind = (degree > 0);
% P(ind, :) = P(ind, :) ./ repmat(degree(ind), 1, n);
P(ind, :) = bsxfun(@rdivide, P(ind, :), degree(ind));
P(~ind, :) = 1 / n;

% add teleportation
P = eta * P + (1 - eta) * ones(n) / n;

% compute Laplacian
L = eye(n) - P;

% commute-time kernel
K = (L - ones(n)/n)^(-1) + ones(n)/n;

F = K * Y;

Time = toc(t);
end
