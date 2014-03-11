//GFunction calculate log10(x) + x * x
class CFunction extends AbstractDrawFunction
{
    @Override
    double f(double x)
    {
    return Math.log10(x) + x * x;
    }
}
