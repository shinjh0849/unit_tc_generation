#!/bin/bash
#SBATCH --gres=gpu:4       # Request GPU "generic resources"
#SBATCH --cpus-per-task=10  # Refer to cluster's documentation for the right CPU/GPU ratio
#SBATCH --mem=100000M       # Memory proportional to GPUs: 32000 Cedar, 47000 Béluga, 64000 Graham.
#SBATCH --time=2-23:00     # DD-HH:MM:SS

source ../ENV_T5/bin/activate 
module load python/3.9.6

python run_exp.py --model_tag codet5_base --task concode --sub_task none

# python run_exp.py --model_tag codet5_base --task translate --sub_task cs-java
